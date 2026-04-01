package com.uniskill.uniskill_api.service;

import com.uniskill.uniskill_api.dto.LoginRequestDTO;
import com.uniskill.uniskill_api.dto.LoginResponseDTO;
import com.uniskill.uniskill_api.dto.RegisterRequestDTO;
import com.uniskill.uniskill_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // gera o construtor automaticamente e o Spring injeta a dependência
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    @Override
    public void register(RegisterRequestDTO registerRequestDTO) {

    }

    @Override
    public LoginResponseDTO login(LoginRequestDTO loginRequestDTO) {
        return null;
    }
}
