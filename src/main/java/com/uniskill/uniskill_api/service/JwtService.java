package com.uniskill.uniskill_api.service;

import com.uniskill.uniskill_api.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Service

public class JwtService {

    @Value("${jwt.secret}") //injeta o valor do token application.properties
    private String secret;

    @Value("${jwt.expiration}") //injeta o tempo de expiração do token
    private Long expiration;


    public String generateToken(User user){
        Date expirationDate = new Date(System.currentTimeMillis() + expiration); //Isso pega o momento atual em milissegundos e
        return Jwts.builder()
                .subject(user.getEmail())
                .claim("role", user.getRole())
                .issuedAt(new Date())
                .expiration(expirationDate)
                .signWith(getSigningKey())
                .compact();                                                                      // soma o tempo de expiração que você definiu no application.properties — resultando na data exata em que o token vai expirar.

    }

    public boolean validateToken(String token){
        try{
            Jwts.parser().verifyWith(getSigningKey()).build().parseSignedClaims(token);
            return true;

        }catch(Exception e){
                    return false;
        }
    }

    //metódo que converte uma string secreta em uma chave criptográfica
    private SecretKey getSigningKey(){
        byte[] keyBytes = Decoders.BASE64.decode(secret);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
