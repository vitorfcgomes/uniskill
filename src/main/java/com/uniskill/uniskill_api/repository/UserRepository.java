package com.uniskill.uniskill_api.repository;

import com.uniskill.uniskill_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email); // busca por email

    UUID id(UUID id);
}
