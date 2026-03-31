package com.uniskill.uniskill_api.repository;

import com.uniskill.uniskill_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
