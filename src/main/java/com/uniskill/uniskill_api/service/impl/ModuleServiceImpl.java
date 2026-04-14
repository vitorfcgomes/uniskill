package com.uniskill.uniskill_api.service.impl;

import com.uniskill.uniskill_api.dto.request.ModuleRequestDTO;
import com.uniskill.uniskill_api.dto.response.ModuleResponseDTO;
import com.uniskill.uniskill_api.repository.CourseRepository;
import com.uniskill.uniskill_api.repository.ModuleRepository;
import com.uniskill.uniskill_api.service.interfaces.ModuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ModuleServiceImpl implements ModuleService {
    private final ModuleRepository moduleRepository;
    private final CourseRepository courseRepository;

    @Override
    public ModuleResponseDTO createModule(UUID courseId, ModuleRequestDTO dto) {
        return null;
    }

    @Override
    public List<ModuleResponseDTO> getModulesByCourse(UUID courseId) {
        return List.of();
    }

    @Override
    public ModuleResponseDTO updateModule(UUID id, ModuleRequestDTO dto) {
        return null;
    }

    @Override
    public void deleteModule(UUID id) {

    }
}
