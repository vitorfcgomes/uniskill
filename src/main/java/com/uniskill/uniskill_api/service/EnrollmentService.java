package com.uniskill.uniskill_api.service;

import com.uniskill.uniskill_api.dto.EnrollmentResponseDTO;

import java.util.UUID;

public interface EnrollmentService {
    public EnrollmentResponseDTO enroll(UUID userId, UUID courseId);
    public EnrollmentResponseDTO getProgress(UUID userId, UUID courseId);
    public EnrollmentResponseDTO completeLesson(UUID userId, UUID lessonId);

}
