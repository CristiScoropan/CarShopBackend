package com.example.carshop.mappere;

import com.example.carshop.DTO.CarPartDTO;
import com.example.carshop.entity.CarPart;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T14:27:43+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4 (Oracle Corporation)"
)
@Component
public class CarPartMapperImpl implements CarPartMapper {

    @Override
    public CarPartDTO EntityToDTO(CarPart carPart) {
        if ( carPart == null ) {
            return null;
        }

        CarPartDTO carPartDTO = new CarPartDTO();

        return carPartDTO;
    }

    @Override
    public CarPart DTOToEntity(CarPartDTO carPartDTO) {
        if ( carPartDTO == null ) {
            return null;
        }

        CarPart carPart = new CarPart();

        return carPart;
    }

    @Override
    public List<CarPart> DTOsToEntities(List<CarPartDTO> carPartDTOS) {
        if ( carPartDTOS == null ) {
            return null;
        }

        List<CarPart> list = new ArrayList<CarPart>( carPartDTOS.size() );
        for ( CarPartDTO carPartDTO : carPartDTOS ) {
            list.add( DTOToEntity( carPartDTO ) );
        }

        return list;
    }

    @Override
    public List<CarPartDTO> entitiesToDTOs(List<CarPart> carParts) {
        if ( carParts == null ) {
            return null;
        }

        List<CarPartDTO> list = new ArrayList<CarPartDTO>( carParts.size() );
        for ( CarPart carPart : carParts ) {
            list.add( EntityToDTO( carPart ) );
        }

        return list;
    }
}
