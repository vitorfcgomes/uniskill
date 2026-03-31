package com.uniskill.uniskill_api.repository;

import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LessonProgressRepository extends JpaRepository<LessonProgressRepository, UUID> {
}
