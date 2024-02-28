package com.example.carshop.controller;

import com.example.carshop.DTO.BikeDTO;
import com.example.carshop.Service.BikeService;
import com.example.carshop.entity.Bike;
import com.example.carshop.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bikes")
public class BikeController {
    private final BikeService bikeService;

    public BikeController(BikeService bikeService) {
        this.bikeService = bikeService;
    }

    @PostMapping("/addBike")
    public ResponseEntity<BikeDTO> addBike(@RequestBody BikeDTO bikeDTO) {
        BikeDTO createdBike = bikeService.addBike(bikeDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBike);
    }

    @PutMapping("/modifyBike/{idBike}")
    public ResponseEntity<BikeDTO> modifyBike(@PathVariable Long idBike, @RequestBody BikeDTO bikeDTO) {
        BikeDTO updatedBike = bikeService.modifyBike(bikeDTO, idBike);
        return ResponseEntity.ok(updatedBike);
    }

    @GetMapping("/filteredBikes")
    public ResponseEntity<List<BikeDTO>> filteredBikes(@RequestBody BikeDTO filterDTO) {
        List<BikeDTO> bikes = bikeService.filteredbikes(filterDTO);
        return ResponseEntity.status(HttpStatus.OK).body(bikes);
    }

    // Additional endpoints for BikeController if needed
}
