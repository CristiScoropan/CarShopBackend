package com.example.carshop.controller;

import com.example.carshop.DTO.BrandDTO;
import com.example.carshop.Service.BrandService;
import com.example.carshop.entity.Brand;
import com.example.carshop.entity.Models;
import com.example.carshop.entity.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping("/addBrand")
    public ResponseEntity<BrandDTO> addBrand(@RequestBody BrandDTO brandDTO) {
        BrandDTO createdBrand = brandService.addBrand(brandDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBrand);
    }

    // Additional endpoints for BrandController if needed
    // Note: Implement other methods as needed, ensuring they use BrandDTO for data transfer.
}
