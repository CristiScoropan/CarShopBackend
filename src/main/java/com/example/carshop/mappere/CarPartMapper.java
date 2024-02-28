package com.example.carshop.mappere;

import com.example.carshop.DTO.CarPartDTO;
import com.example.carshop.entity.Car;
import com.example.carshop.entity.CarPart;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarPartMapper {
    CarPartDTO EntityToDTO(CarPart carPart);
    CarPart DTOToEntity(CarPartDTO carPartDTO);
    List<CarPart>DTOsToEntities(List<CarPartDTO>carPartDTOS);
    List<CarPartDTO>entitiesToDTOs(List<CarPart>carParts);
}
