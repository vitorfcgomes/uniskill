package com.uniskill.uniskill_api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
public class EnrollmentResponseDTO {
    private UUID id;
    private UUID userid;
    private UUID courseId;
    private Integer progressPercent;
    private LocalDateTime enrolledAt;
}
