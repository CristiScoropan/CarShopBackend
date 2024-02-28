package com.example.carshop.mappere;

import com.example.carshop.DTO.TruckDTO;
import com.example.carshop.entity.Truck;
import org.mapstruct.Mapper;

@Mapper
public interface TruckMapper {
    Truck DTOToEntity (TruckDTO truckDTO);
    TruckDTO EntityToDTO (Truck truck);

}
