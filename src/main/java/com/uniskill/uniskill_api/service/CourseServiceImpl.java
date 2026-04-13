package com.uniskill.uniskill_api.service;

import com.uniskill.uniskill_api.dto.CourseRequestDTO;
import com.uniskill.uniskill_api.dto.CourseResponseDTO;
import com.uniskill.uniskill_api.model.Course;
import com.uniskill.uniskill_api.model.User;
import com.uniskill.uniskill_api.repository.CourseRepository;
import com.uniskill.uniskill_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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
        course.setRating(0.0);
        course.setCreatedAt(LocalDateTime.now());

        Course saved = courseRepository.save(course);

        return CourseResponseDTO.fromEntity(saved);
    }

    @Override
    public List<CourseResponseDTO> getAllCourses() {
        return courseRepository.findAll().stream().map(CourseResponseDTO::fromEntity).collect(Collectors.toList());
    }

    @Override
    public CourseResponseDTO getCourseById(UUID id) {
        Course course = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso não encontrado!"));
        return CourseResponseDTO.fromEntity(course);
    }

    @Override
    public CourseResponseDTO updateCourse(UUID id, CourseRequestDTO dto) {
        Course course = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso não encontrado!"));

        course.setTitle(dto.getTitle());
        course.setDescription(dto.getDescription());
        course.setCategory(dto.getCategory());
        course.setPrice(dto.getPrice());
        course.setThumbnailUrl(dto.getThumbnailUrl());

        Course saved = courseRepository.save(course);
        return CourseResponseDTO.fromEntity(saved);
    }

    @Override
    public void deleteCourse(UUID id) {
        Course course = courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso não encontrado!"));
        courseRepository.deleteById(id);
    }
}
