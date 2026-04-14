package com.uniskill.uniskill_api.service.interfaces;

import com.uniskill.uniskill_api.dto.request.CourseRequestDTO;
import com.uniskill.uniskill_api.dto.response.CourseResponseDTO;

import java.util.List;
import java.util.UUID;

public interface CourseService {
    public CourseResponseDTO createCourse(CourseRequestDTO dto, UUID creatorId);
    public List<CourseResponseDTO> getAllCourses();
    public CourseResponseDTO getCourseById(UUID id);
    public CourseResponseDTO updateCourse(UUID id, CourseRequestDTO dto);
    public void deleteCourse(UUID id);
}
