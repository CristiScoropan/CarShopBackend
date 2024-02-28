package com.example.carshop.controller;

import com.example.carshop.DTO.CarDTO;
import com.example.carshop.Service.CarService;
import com.example.carshop.entity.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/addCar")
    public ResponseEntity<CarDTO> addCar(@RequestBody CarDTO carDTO) {
        CarDTO createdCar = carService.addCar(carDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCar);
    }

    @PutMapping("/modifyCar/{id}")
    public ResponseEntity<CarDTO> modifyCar(@PathVariable Long id, @RequestBody CarDTO carDTO) {
        CarDTO updatedCar = carService.modifyCar(carDTO, id);
        return ResponseEntity.ok(updatedCar);
    }

    @GetMapping("/filterCars")
    public ResponseEntity<List<CarDTO>> filterCars(@RequestParam String brandName, @RequestParam String caroserieName, @RequestParam String gasName, @RequestParam String modelName, @RequestParam int km, @RequestParam int price, @RequestParam int year) {
        List<CarDTO> cars = carService.filteredCars(brandName, caroserieName, gasName, modelName, km, price, year);
        return ResponseEntity.status(HttpStatus.OK).body(cars);
    }

    // Additional endpoints for CarController if needed
}