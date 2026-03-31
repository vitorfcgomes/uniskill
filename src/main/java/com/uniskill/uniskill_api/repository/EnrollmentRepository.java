package com.uniskill.uniskill_api.repository;

import com.uniskill.uniskill_api.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnrollmentRepository extends JpaRepository<Enrollment, UUID> {
}
