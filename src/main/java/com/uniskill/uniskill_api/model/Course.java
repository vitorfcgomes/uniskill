package com.uniskill.uniskill_api.model;

import com.uniskill.uniskill_api.model.enums.Category;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_courses")
@Data
@NoArgsConstructor
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "creator_id")
    private User creator;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;

    private Double price;
    private Double rating;
    private String thumbnailUrl;
    private LocalDateTime createdAt;
}
