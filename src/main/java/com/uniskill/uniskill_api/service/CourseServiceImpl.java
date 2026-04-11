package com.uniskill.uniskill_api.service;

import com.uniskill.uniskill_api.dto.CourseRequestDTO;
import com.uniskill.uniskill_api.dto.CourseResponseDTO;
import com.uniskill.uniskill_api.model.Course;
import com.uniskill.uniskill_api.model.User;
import com.uniskill.uniskill_api.repository.CourseRepository;
import com.uniskill.uniskill_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{
    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    @Override
    public CourseResponseDTO createCourse(CourseRequestDTO dto, UUID creatorId) {
        User creator = userRepository.findById(creatorId).orElseThrow(()-> new RuntimeException("Criador não encontrado"));

        Course course = new Course();

        course.setTitle(dto.getTitle());
        course.setDescription(dto.getDescription());
        course.setCategory(dto.getCategory());
        course.setPrice(dto.getPrice());
        course.setThumbnailUrl(dto.getThumbnailUrl());
        course.setCreator(creator);

        Course saved = courseRepository.save(course);

        return new CourseResponseDTO(saved);
    }

    @Override
    public List<CourseResponseDTO> getAllCourses() {
        return List.of();
    }

    @Override
    public CourseResponseDTO getCourseById(UUID id) {
        return null;
    }

    @Override
    public CourseResponseDTO updateCourse(UUID id, CourseRequestDTO dto) {
        return null;
    }

    @Override
    public void deleteCourse(UUID id) {

    }
}
