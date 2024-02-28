package com.example.carshop.mappere;

import com.example.carshop.DTO.CaroserieDTO;
import com.example.carshop.entity.Caroserie;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T14:27:43+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4 (Oracle Corporation)"
)
public class CaroserieMApperImpl implements CaroserieMApper {

    @Override
    public Caroserie DTOToEntity(CaroserieDTO caroserieDTO) {
        if ( caroserieDTO == null ) {
            return null;
        }

        Caroserie caroserie = new Caroserie();

        return caroserie;
    }

    @Override
    public CaroserieDTO EntityToDTO(Caroserie caroserie) {
        if ( caroserie == null ) {
            return null;
        }

        CaroserieDTO caroserieDTO = new CaroserieDTO();

        return caroserieDTO;
    }
}
