package com.example.carshop.mappere;

import com.example.carshop.DTO.ModelsDTO;
import com.example.carshop.entity.Models;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T14:27:42+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4 (Oracle Corporation)"
)
public class ModelMapperImpl implements ModelMapper {

    @Override
    public Models DTOToEntity(ModelsDTO modelsDTO) {
        if ( modelsDTO == null ) {
            return null;
        }

        Models models = new Models();

        return models;
    }

    @Override
    public ModelsDTO EntityToDTO(Models models) {
        if ( models == null ) {
            return null;
        }

        ModelsDTO modelsDTO = new ModelsDTO();

        return modelsDTO;
    }
}
