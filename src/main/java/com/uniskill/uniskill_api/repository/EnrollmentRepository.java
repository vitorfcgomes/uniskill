package com.uniskill.uniskill_api.repository;

import com.uniskill.uniskill_api.model.Course;
import com.uniskill.uniskill_api.model.Enrollment;
import com.uniskill.uniskill_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnrollmentRepository extends JpaRepository<Enrollment, UUID> {
    public boolean existsByUserAndCourse(User user, Course course);
}
