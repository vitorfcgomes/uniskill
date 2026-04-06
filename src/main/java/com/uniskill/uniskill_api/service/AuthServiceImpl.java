package com.uniskill.uniskill_api.service;

import com.uniskill.uniskill_api.dto.LoginRequestDTO;
import com.uniskill.uniskill_api.dto.LoginResponseDTO;
import com.uniskill.uniskill_api.dto.RegisterRequestDTO;
import com.uniskill.uniskill_api.model.User;
import com.uniskill.uniskill_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor // gera o construtor automaticamente e o Spring injeta a dependência
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    @Override
    public void register(RegisterRequestDTO registerRequestDTO) {
        //verifica se o email já existe
        if(userRepository.findByEmail(registerRequestDTO.getEmail()).isPresent()){
            throw new RuntimeException("Email já cadastrado");
        }
        //criptografa a senha com BCrypt utilizando um hash seguro
        String encryptedPassword = passwordEncoder.encode(registerRequestDTO.getPassword());

        //cria o objeto user e preenche todos os campos
        User user = new User();

        user.setName(registerRequestDTO.getUsername());
        user.setEmail(registerRequestDTO.getEmail());
        user.setPassword(encryptedPassword);
        user.setCreatedAt(LocalDateTime.now());
        user.setRole(registerRequestDTO.getRole());
        user.setPhone(registerRequestDTO.getPhone());

        //salva no banco de dados
        userRepository.save(user);
    }

    @Override
    public LoginResponseDTO login(LoginRequestDTO loginRequestDTO) {
        Optional<User> optionalUser = userRepository.findByEmail(loginRequestDTO.getEmail());
        if (!optionalUser.isPresent()){
            throw new RuntimeException("Email não encontrado!");
        }

        User user = optionalUser.get();

        if (!passwordEncoder.matches(loginRequestDTO.getPassword(), user.getPassword())){
           throw new RuntimeException("Senha incorreta!");
        }
        String token = jwtService.generateToken(user);

        LoginResponseDTO loginResponseDTO = new LoginResponseDTO();
        loginResponseDTO.setMessage("Login realizado com sucesso!");
        loginResponseDTO.setToken(token);

        return loginResponseDTO;
    }
}
