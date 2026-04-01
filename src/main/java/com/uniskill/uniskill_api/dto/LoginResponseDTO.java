package com.uniskill.uniskill_api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class LoginResponseDTO {
    private String message;
    private String token;
}
