package com.example.carshop.Service;

import com.example.carshop.entity.Car;
import com.example.carshop.entity.CarPart;
import com.example.carshop.repository.CarPartRepo;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPartService {
    private final CarPartRepo carPartRepo;

    public CarPartService(CarPartRepo carPartRepo){
        this.carPartRepo = carPartRepo;
    }

    public CarPart addCarPart(Long Id, String partName, String manufacturer, Integer price){
        CarPart carPart = new CarPart();
        carPart.setPartName(partName);
        carPart.setManufacturer(manufacturer);
        carPart.setPrice(price);
        carPartRepo.save(carPart);
        return carPart;
    }

    public List<CarPart> findCarParts(Long Id, String partName, String manufacturer, Integer price){
        return carPartRepo.findByPartName(partName);
    }

    public CarPart updateCarPart(Long Id, String partName, String manufacturer, Integer price){
        CarPart carPart = carPartRepo.findById(Id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid car part ID:" + Id));

        carPart.setPartName(partName);
        carPart.setManufacturer(manufacturer);
        carPart.setPrice(price);
        carPartRepo.save(carPart);
        return carPart;
    }

    public void deleteCarPart(Long Id){
        carPartRepo.deleteById(Id);
    }
}
