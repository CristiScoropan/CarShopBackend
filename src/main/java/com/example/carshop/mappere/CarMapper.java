package com.example.carshop.mappere;

import com.example.carshop.DTO.CarDTO;
import com.example.carshop.entity.Car;
import org.mapstruct.Mapper;

@Mapper
public interface CarMapper {
    Car DTOToEntity (CarDTO carDTO);
    CarDTO EntityToDTO (Car car);

}
