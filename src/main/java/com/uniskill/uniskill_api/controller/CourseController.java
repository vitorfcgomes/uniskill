package com.uniskill.uniskill_api.controller;

import com.uniskill.uniskill_api.dto.request.CourseRequestDTO;
import com.uniskill.uniskill_api.dto.response.CourseResponseDTO;
import com.uniskill.uniskill_api.service.interfaces.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/courses")
@CrossOrigin("*")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping
    public ResponseEntity<CourseResponseDTO> createCourse(@RequestBody CourseRequestDTO dto, @RequestParam UUID creatorId){
        CourseResponseDTO response = courseService.createCourse(dto, creatorId);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<CourseResponseDTO>> getAllCourses(){
        return ResponseEntity.ok(courseService.getAllCourses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseResponseDTO> getCourseById(@PathVariable UUID id){
        return ResponseEntity.ok(courseService.getCourseById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<CourseResponseDTO> updateCourse(@PathVariable UUID id, @RequestBody CourseRequestDTO dto){
        return ResponseEntity.ok(courseService.updateCourse(id, dto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable UUID id){
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}
