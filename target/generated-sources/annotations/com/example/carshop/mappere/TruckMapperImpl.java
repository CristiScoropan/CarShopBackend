package com.example.carshop.mappere;

import com.example.carshop.DTO.TruckDTO;
import com.example.carshop.entity.Truck;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T14:27:42+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4 (Oracle Corporation)"
)
public class TruckMapperImpl implements TruckMapper {

    @Override
    public Truck DTOToEntity(TruckDTO truckDTO) {
        if ( truckDTO == null ) {
            return null;
        }

        Truck truck = new Truck();

        return truck;
    }

    @Override
    public TruckDTO EntityToDTO(Truck truck) {
        if ( truck == null ) {
            return null;
        }

        TruckDTO truckDTO = new TruckDTO();

        return truckDTO;
    }
}
