package com.uniskill.uniskill_api.service;

import com.uniskill.uniskill_api.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service

public class JwtService {

    @Value("${jwt.secret}") //injeta o valor do token application.properties
    private String secret;

    @Value("${jwt.expiration}") //injeta o tempo de expiração do token
    private Long expiration;

    public String generateToken(User user){
        return null;
    }
    public boolean validateToken(String token){
        return false;
    }
}
