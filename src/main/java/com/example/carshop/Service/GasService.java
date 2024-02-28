package com.example.carshop.Service;

import com.example.carshop.DTO.GasDTO;
import com.example.carshop.entity.Gas;
import com.example.carshop.mappere.GasMapper;
import com.example.carshop.repository.GasRepo;
import org.springframework.stereotype.Service;

@Service

public class GasService {

    private final GasRepo gasRepo;
    private final GasMapper gasMapper;

    public GasService(GasRepo gasRepo, GasMapper gasMapper) {
        this.gasRepo = gasRepo;
        this.gasMapper = gasMapper;
    }

    public GasDTO addGasType(GasDTO gasDTO){
        return gasMapper.EntityToDTO(gasRepo.save(gasMapper.DTOToEntity(gasDTO)));
    }
}
