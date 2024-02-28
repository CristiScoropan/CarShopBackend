package com.example.carshop.mappere;

import com.example.carshop.DTO.BikeDTO;
import com.example.carshop.entity.Bike;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T14:27:43+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4 (Oracle Corporation)"
)
public class BikeMapperImpl implements BikeMapper {

    @Override
    public Bike DTOToEntity(BikeDTO bikeDTO) {
        if ( bikeDTO == null ) {
            return null;
        }

        Bike bike = new Bike();

        return bike;
    }

    @Override
    public BikeDTO EntityToDTO(Bike bike) {
        if ( bike == null ) {
            return null;
        }

        BikeDTO bikeDTO = new BikeDTO();

        return bikeDTO;
    }

    @Override
    public List<BikeDTO> EntitiesToDTOs(List<Bike> bikes) {
        if ( bikes == null ) {
            return null;
        }

        List<BikeDTO> list = new ArrayList<BikeDTO>( bikes.size() );
        for ( Bike bike : bikes ) {
            list.add( EntityToDTO( bike ) );
        }

        return list;
    }
}
