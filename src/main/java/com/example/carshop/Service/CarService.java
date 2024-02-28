package com.example.carshop.Service;

import com.example.carshop.DTO.CarDTO;
import com.example.carshop.entity.*;
import com.example.carshop.mappere.CarMapper;
import com.example.carshop.repository.*;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final CarRepo carRepo;

    private final BrandRepo brandRepo;

    private final ModelsRepo modelsRepo;

    private final GasRepo gasRepo;

    private final CaroserieRepo caroserieRepo;

    private final CarMapper carMapper;
    public CarService(CarRepo carRepo, BrandRepo brandRepo, ModelsRepo modelsRepo, GasRepo gasRepo, CaroserieRepo caroserieRepo,CarMapper carMapper) {
        this.carRepo = carRepo;
        this.brandRepo = brandRepo;
        this.modelsRepo = modelsRepo;
        this.gasRepo = gasRepo;
        this.caroserieRepo = caroserieRepo;
        this.carMapper = carMapper;
    }

    public CarDTO addCar(CarDTO carDTO){
        Car car = carMapper.DTOToEntity(carDTO);
        carRepo.save(car);
        return carMapper.EntityToDTO(car);
    }

    public CarDTO modifyCar(CarDTO carDTO, Long idCar) {
        Car carEntity = carMapper.DTOToEntity(carDTO);

        // Check if the brand, caroserie, and models are suitable for CAR
        if (carEntity.getBrand().getVehicleType().equals(VehicleType.CAR) &&
                carEntity.getCaroserie().getVehicleType().equals(VehicleType.CAR) &&
                carEntity.getModels().getVehicleType().equals(VehicleType.CAR)) {

            Car car = carRepo.findById(idCar)
                    .orElseThrow(() -> new NoSuchElementException("Car not found with id: " + idCar));

            // Update the car entity with DTO data
            car.setBrand(carEntity.getBrand());
            car.setCaroserie(carEntity.getCaroserie());
            car.setModels(carEntity.getModels());
            car.setKm(carDTO.getKm());
            car.setGas(carDTO.getGas());
            car.setYear(carDTO.getYear());
            car.setPrice(carDTO.getPrice());

            // Save the updated car entity
            return carMapper.EntityToDTO(carRepo.save(car));
        } else {
            throw new InvalidParameterException("Either the brand, model, or caroserie name is not suitable for this type of vehicle");
        }
    }

    public List<CarDTO> filteredCars(String brandName, String caroserieName, String gasName, String modelName, int km, int price, int year){
        Brand brand = brandRepo.findBrandByName(brandName);
        Caroserie caroserie = caroserieRepo.findCaroserieByName(caroserieName);
        Models models = modelsRepo.findModelByName(modelName);
        Gas gas = gasRepo.findGasByName(gasName);
        List<Car> cars = carRepo.filterCars(brand, caroserie, gas, models, km, price, year);
        return cars.stream().map(carMapper::EntityToDTO).collect(Collectors.toList());
    }

}
