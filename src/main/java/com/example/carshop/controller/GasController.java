package com.example.carshop.controller;

import com.example.carshop.DTO.GasDTO;
import com.example.carshop.Service.GasService;
import com.example.carshop.entity.Gas;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gas")
public class GasController {
    private final GasService gasService;

    public GasController(GasService gasService) {
        this.gasService = gasService;
    }

    @PostMapping("/addGasType")
    public ResponseEntity<GasDTO> addGasType(@RequestBody GasDTO gasDTO) {
        GasDTO createdGas = gasService.addGasType(gasDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdGas);
    }

    // Additional endpoints for GasController if needed
}
