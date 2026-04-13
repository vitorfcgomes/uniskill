package com.uniskill.uniskill_api.service;

import com.uniskill.uniskill_api.dto.EnrollmentRequestDTO;
import com.uniskill.uniskill_api.dto.EnrollmentResponseDTO;
import com.uniskill.uniskill_api.model.Course;
import com.uniskill.uniskill_api.model.User;
import com.uniskill.uniskill_api.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EnrollmentServiceImpl implements EnrollmentService{

    private final EnrollmentRepository enrollmentRepository;
    private final UserRepository userRepository;
    private final CourseRepository courseRepository;
    private final LessonRepository lessonRepository;
    private final LessonProgressRepository lessonProgressRepository;

    @Override
    public EnrollmentResponseDTO enroll(UUID userId, UUID courseId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Curso não encontrado!"));
        if(enrollmentRepository.existsByUserAndCourse(user, course)){
            throw new RuntimeException("Aluno já matriculado neste curso!");
        }
        return null;
    }

    @Override
    public EnrollmentResponseDTO getProgress(UUID userId, UUID courseId) {
        return null;
    }

    @Override
    public EnrollmentResponseDTO completeLesson(UUID userId, UUID lessonId) {
        return null;
    }
}
