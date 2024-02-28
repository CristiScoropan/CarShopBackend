package com.example.carshop.controller;

import com.example.carshop.DTO.ModelsDTO;
import com.example.carshop.Service.ModelsService;
import com.example.carshop.entity.Models;
import com.example.carshop.entity.VehicleType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/models")
public class ModelsController {
    private final ModelsService modelsService;

    public ModelsController(ModelsService modelsService) {
        this.modelsService = modelsService;
    }

    @PostMapping("/addModel")
    public ResponseEntity<ModelsDTO> addModel(@RequestBody ModelsDTO modelsDTO) {
        ModelsDTO createdModel = modelsService.addModel(modelsDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdModel);
    }

    // Additional endpoints for ModelsController if needed
}
