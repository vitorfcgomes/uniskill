package com.uniskill.uniskill_api.dto;

import com.uniskill.uniskill_api.model.Course;
import com.uniskill.uniskill_api.model.enums.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
public class CourseResponseDTO {
    private UUID id;
    private String title;
    private String description;
    private Category category;
    private BigDecimal price;
    private Double rating;
    private String thumbnailUrl;
    private LocalDateTime createdAt;
    private String creatorName;

    public static CourseResponseDTO fromEntity(Course course) {
        CourseResponseDTO dto = new CourseResponseDTO();
        dto.setId(course.getId());
        dto.setTitle(course.getTitle());
        dto.setDescription(course.getDescription());
        dto.setCategory(course.getCategory());
        dto.setPrice(course.getPrice());
        dto.setRating(course.getRating());
        dto.setThumbnailUrl(course.getThumbnailUrl());
        dto.setCreatedAt(course.getCreatedAt());
        dto.setCreatorName(course.getCreator().getUsername());
        return dto;
    }
}