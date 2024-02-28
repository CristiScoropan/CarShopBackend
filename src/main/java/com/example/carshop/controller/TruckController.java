package com.example.carshop.controller;

import com.example.carshop.DTO.TruckDTO;
import com.example.carshop.Service.TruckService;
import com.example.carshop.entity.Car;
import com.example.carshop.entity.Truck;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trucks")
public class TruckController {
    private final TruckService truckService;

    public TruckController(TruckService truckService) {
        this.truckService = truckService;
    }

    @PostMapping("/addTruck")
    public ResponseEntity<TruckDTO> addTruck(@RequestBody TruckDTO truckDTO) {
        TruckDTO createdTruck = truckService.addTruck(truckDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTruck);
    }

    @PutMapping("/modifyTruck/{id}")
    public ResponseEntity<TruckDTO> modifyTruck(@PathVariable Long id, @RequestBody TruckDTO truckDTO) {
        TruckDTO updatedTruck = truckService.modifyTruck(truckDTO, id);
        return ResponseEntity.ok(updatedTruck);
    }

    @GetMapping("/filteredTrucks")
    public ResponseEntity<List<TruckDTO>> filteredTrucks(@RequestParam String brandName, @RequestParam String caroserieName, @RequestParam String gasName, @RequestParam String modelName, @RequestParam int km, @RequestParam int price, @RequestParam int year) {
        List<TruckDTO> trucks = truckService.filteredTrucks(brandName, caroserieName, gasName, modelName, km, price, year);
        return ResponseEntity.status(HttpStatus.OK).body(trucks);
    }

    // Additional endpoints for TruckController if needed
}