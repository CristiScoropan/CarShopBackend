package com.example.carshop.mappere;

import com.example.carshop.DTO.ModelsDTO;
import com.example.carshop.entity.Models;
import org.mapstruct.Mapper;

@Mapper
public interface ModelMapper {
    Models DTOToEntity (ModelsDTO modelsDTO);
    ModelsDTO EntityToDTO (Models models);
}
