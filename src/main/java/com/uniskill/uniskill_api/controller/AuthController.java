package com.uniskill.uniskill_api.controller;

import com.uniskill.uniskill_api.dto.LoginRequestDTO;
import com.uniskill.uniskill_api.dto.LoginResponseDTO;
import com.uniskill.uniskill_api.dto.RegisterRequestDTO;
import com.uniskill.uniskill_api.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegisterRequestDTO registerRequestDTO){
       authService.register(registerRequestDTO);
       return ResponseEntity.status(HttpStatus.CREATED).build();
   }

   @PostMapping("/login")
   public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO){
        LoginResponseDTO logined = authService.login(loginRequestDTO);
        return ResponseEntity.ok(logined);
   }
}
