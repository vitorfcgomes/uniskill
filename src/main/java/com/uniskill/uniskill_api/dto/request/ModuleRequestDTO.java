package com.uniskill.uniskill_api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ModuleRequestDTO {
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotNull
    private Integer orderIndex;
}
