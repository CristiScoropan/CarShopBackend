package com.example.carshop.mappere;

import com.example.carshop.DTO.CaroserieDTO;
import com.example.carshop.entity.Caroserie;
import org.mapstruct.Mapper;
@Mapper
public interface CaroserieMApper {
        Caroserie DTOToEntity (CaroserieDTO caroserieDTO);
        CaroserieDTO EntityToDTO (Caroserie caroserie);
}
