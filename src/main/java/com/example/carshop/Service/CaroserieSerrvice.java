package com.example.carshop.Service;

import com.example.carshop.DTO.CaroserieDTO;
import com.example.carshop.entity.Caroserie;
import com.example.carshop.entity.VehicleType;
import com.example.carshop.mappere.CaroserieMApper;
import com.example.carshop.repository.CaroserieRepo;
import org.springframework.stereotype.Service;

@Service

public class CaroserieSerrvice {
    private final CaroserieRepo caroserieRepo;
    private final CaroserieMApper caroserieMApper;

    public CaroserieSerrvice(CaroserieRepo caroserieRepo, CaroserieMApper caroserieMApper) {
        this.caroserieRepo = caroserieRepo;
        this.caroserieMApper = caroserieMApper;
    }

    public CaroserieDTO addCaroserie(CaroserieDTO caroserieDTO){
        return caroserieMApper.EntityToDTO(caroserieRepo.save(caroserieMApper.DTOToEntity(caroserieDTO)));
    }
}
