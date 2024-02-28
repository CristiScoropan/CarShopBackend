package com.example.carshop.Service;

import com.example.carshop.DTO.BrandDTO;
import com.example.carshop.mappere.BrandMapper;
import com.example.carshop.repository.BrandRepo;
import com.example.carshop.repository.ModelsRepo;
import org.springframework.stereotype.Service;

@Service
public class BrandService {
    private final BrandRepo brandRepo;
    private final ModelsRepo modelsRepo;
    private final BrandMapper brandMapper;

    public BrandService(BrandRepo brandRepo, ModelsRepo modelsRepo, BrandMapper brandMapper) {
        this.brandRepo = brandRepo;
        this.modelsRepo = modelsRepo;
        this.brandMapper = brandMapper;
    }

    public BrandDTO addBrand(BrandDTO brandDTO){
        return brandMapper.EntityToDto(brandRepo.save(brandMapper.DtoToEntity(brandDTO)));
    }

}
