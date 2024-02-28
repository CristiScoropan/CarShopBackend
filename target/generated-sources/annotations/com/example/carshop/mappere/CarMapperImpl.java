package com.example.carshop.mappere;

import com.example.carshop.DTO.CarDTO;
import com.example.carshop.entity.Car;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T14:27:43+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4 (Oracle Corporation)"
)
public class CarMapperImpl implements CarMapper {

    @Override
    public Car DTOToEntity(CarDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Car car = new Car();

        return car;
    }

    @Override
    public CarDTO EntityToDTO(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        return carDTO;
    }
}
