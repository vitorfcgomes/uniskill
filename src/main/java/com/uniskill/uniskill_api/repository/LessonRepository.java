package com.uniskill.uniskill_api.repository;

import com.uniskill.uniskill_api.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LessonRepository extends JpaRepository<Lesson, UUID> {
}
