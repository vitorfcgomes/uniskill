package com.uniskill.uniskill_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
import com.uniskill.uniskill_api.model.Module;

public interface ModuleRepository extends JpaRepository<Module, UUID> {
}
