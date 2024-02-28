package com.example.carshop.Service;

import com.example.carshop.DTO.ModelsDTO;
import com.example.carshop.entity.Models;
import com.example.carshop.entity.VehicleType;
import com.example.carshop.mappere.ModelMapper;
import com.example.carshop.repository.ModelsRepo;
import org.springframework.stereotype.Service;

@Service
public class ModelsService {
    private final ModelsRepo modelsRepo;
    private final ModelMapper modelMapper;

    public ModelsService(ModelsRepo modelsRepo, ModelMapper modelMapper) {
        this.modelsRepo = modelsRepo;
        this.modelMapper = modelMapper;
    }

    public ModelsDTO addModel(ModelsDTO modelsDTO){
        return modelMapper.EntityToDTO(modelsRepo.save(modelMapper.DTOToEntity(modelsDTO)));
    }
}
