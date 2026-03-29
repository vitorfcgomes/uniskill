package com.uniskill.uniskill_api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_lessons")
@Data
@NoArgsConstructor
public class Lesson implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    private String title;
    private Integer orderIndex;
    private String videoUrl;
    private String materialUrl;
}
