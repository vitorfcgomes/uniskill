package com.uniskill.uniskill_api.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class EnrollmentRequestDTO {
    private UUID courseId;
}
