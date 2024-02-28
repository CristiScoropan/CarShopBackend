package com.example.carshop.controller;

import com.example.carshop.DTO.CaroserieDTO;
import com.example.carshop.Service.CaroserieSerrvice;
import com.example.carshop.entity.Caroserie;
import com.example.carshop.entity.VehicleType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/caroseries")
public class CaroserieController {
    private final CaroserieSerrvice caroserieService;

    public CaroserieController(CaroserieSerrvice caroserieService) {
        this.caroserieService = caroserieService;
    }

    @PostMapping("/addCaroserie")
    public ResponseEntity<CaroserieDTO> addCaroserie(@RequestBody CaroserieDTO caroserieDTO) {
        CaroserieDTO createdCaroserie = caroserieService.addCaroserie(caroserieDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCaroserie);
    }

    // Additional endpoints for CaroserieController if needed
}
