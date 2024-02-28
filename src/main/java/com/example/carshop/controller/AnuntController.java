package com.example.carshop.controller;

import com.example.carshop.DTO.AnuntDTO;
import com.example.carshop.Service.AnuntService;
import com.example.carshop.entity.Anunt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anunturi")
public class AnuntController {

    private final AnuntService anuntService;

    public AnuntController(AnuntService anuntService) {
        this.anuntService = anuntService;
    }

    @PostMapping
    public ResponseEntity<AnuntDTO> addAnunt(@RequestBody AnuntDTO anuntDTO) {
        return ResponseEntity.ok(anuntService.addAnunt(anuntDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnuntDTO> modifyAnunt(@PathVariable Long id, @RequestBody AnuntDTO anuntDTO) {
        return ResponseEntity.ok(anuntService.modifyAnunt(id, anuntDTO));
    }

    // Additional endpoints for AnuntController if needed
}
