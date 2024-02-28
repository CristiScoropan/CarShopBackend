package com.example.carshop.mappere;

import com.example.carshop.DTO.BikeDTO;
import com.example.carshop.entity.Bike;
import org.mapstruct.Mapper;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Mapper
public interface BikeMapper {
    Bike DTOToEntity (BikeDTO bikeDTO);
    BikeDTO EntityToDTO (Bike bike);
    List<BikeDTO> EntitiesToDTOs (List<Bike> bikes);
}
