package com.uniskill.uniskill_api.repository;

import com.uniskill.uniskill_api.model.LessonProgress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LessonProgressRepository extends JpaRepository<LessonProgress, UUID> {
}
