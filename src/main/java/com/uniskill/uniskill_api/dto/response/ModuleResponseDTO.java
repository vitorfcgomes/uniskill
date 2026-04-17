package com.uniskill.uniskill_api.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;
import com.uniskill.uniskill_api.model.Module;

@Data
@NoArgsConstructor
public class ModuleResponseDTO {
    private UUID id;
    private UUID courseId;
    private String title;
    private String description;
    private Integer orderIndex;
    private LocalDateTime createdAt;

    public static ModuleResponseDTO fromEntity(Module module) {
        ModuleResponseDTO dto = new ModuleResponseDTO();
        dto.setId(module.getId());
        dto.setCourseId(module.getCourse().getId());
        dto.setTitle(module.getTitle());
        dto.setDescription(module.getDescription());
        dto.setOrderIndex(module.getOrderIndex());
        dto.setCreatedAt(module.getCreatedAt());
        return dto;
    }
}
