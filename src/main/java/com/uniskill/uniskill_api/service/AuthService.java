package com.uniskill.uniskill_api.service;


import com.uniskill.uniskill_api.dto.LoginRequestDTO;
import com.uniskill.uniskill_api.dto.LoginResponseDTO;
import com.uniskill.uniskill_api.dto.RegisterRequestDTO;

public interface AuthService {
   void register(RegisterRequestDTO registerRequestDTO);
   LoginResponseDTO login(LoginRequestDTO loginRequestDTO);



}
