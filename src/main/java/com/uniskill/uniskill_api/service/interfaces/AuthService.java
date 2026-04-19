package com.uniskill.uniskill_api.service.interfaces;


import com.uniskill.uniskill_api.dto.request.LoginRequestDTO;
import com.uniskill.uniskill_api.dto.response.LoginResponseDTO;
import com.uniskill.uniskill_api.dto.request.RegisterRequestDTO;

public interface AuthService {
   void register(RegisterRequestDTO registerRequestDTO);
   LoginResponseDTO login(LoginRequestDTO loginRequestDTO);



}
