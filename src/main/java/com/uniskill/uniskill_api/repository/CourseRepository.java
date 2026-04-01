package com.uniskill.uniskill_api.repository;

import com.uniskill.uniskill_api.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
}
