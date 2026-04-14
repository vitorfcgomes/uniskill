package com.uniskill.uniskill_api.service.interfaces;

import com.uniskill.uniskill_api.dto.request.ModuleRequestDTO;
import com.uniskill.uniskill_api.dto.response.ModuleResponseDTO;

import java.util.List;
import java.util.UUID;

public interface ModuleService {
    public ModuleResponseDTO createModule(UUID courseId, ModuleRequestDTO dto);
    public List<ModuleResponseDTO> getModulesByCourse(UUID courseId);
    public ModuleResponseDTO updateModule(UUID id, ModuleRequestDTO dto);
    public void deleteModule(UUID id);
}
