package com.example.carshop.controller;
import com.example.carshop.Service.CarPartService;
import com.example.carshop.entity.Car;
import com.example.carshop.entity.CarPart;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car-part")
public class CarPartController {
    private final CarPartService carPartService;

    public CarPartController(CarPartService carPartService){
        this.carPartService = carPartService;
    }

    @PutMapping("/addCarPart")
    public ResponseEntity<CarPart> addCarPart(@RequestBody CarPart carPart){
        CarPart newCarPart = carPartService.addCarPart(
            carPart.getId(),
            carPart.getPartName(),
            carPart.getManufacturer(),
            carPart.getPrice()
        );
        return new ResponseEntity<>(newCarPart, HttpStatus.CREATED);
    }

    @GetMapping("/findCarParts")
    public ResponseEntity<List<CarPart>> findCarParts(@RequestParam(required = false) Long Id, String partName, String manufacturer, Integer price){
        List<CarPart>carParts = carPartService.findCarParts(Id, partName, manufacturer, price);
        return new ResponseEntity<>(carParts, HttpStatus.OK);
    }
    @PutMapping("/modifyCarPart/{id}")
    public ResponseEntity<CarPart> modifyCarPart(@PathVariable Long Id, @RequestBody CarPart carPart){
        CarPart updatedCarPart = carPartService.updateCarPart(
                Id,
                carPart.getPartName(),
                carPart.getManufacturer(),
                carPart.getPrice()
        );
        return new ResponseEntity<>(updatedCarPart, HttpStatus.OK);
    }
    @DeleteMapping("/deleteCarPart/{id}")
    public ResponseEntity<Void> deleteCarPart(@PathVariable Long Id){
        carPartService.deleteCarPart(Id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
