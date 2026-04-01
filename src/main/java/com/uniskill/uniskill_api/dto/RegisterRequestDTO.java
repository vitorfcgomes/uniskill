package com.uniskill.uniskill_api.dto;

import com.uniskill.uniskill_api.model.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class RegisterRequestDTO {
    @NotBlank // campo não pode ser nulo ou vazio
    private String name;

    @NotBlank
    @Email // valida formato de email
    private String email;

    @NotBlank
    @Size(min = 8) // define o tamanho mínimo para uma senha
    private String password;

    @NotNull // garante que o campo não chegue nulo na requisição
    private Role role;

    private String phone;
}
