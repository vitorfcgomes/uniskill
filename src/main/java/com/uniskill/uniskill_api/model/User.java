package com.uniskill.uniskill_api.model;

import com.uniskill.uniskill_api.model.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_users")
@Data
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String username;
    private String email;
    private String password;
    private String avatarUrl;
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private Role role;

}
