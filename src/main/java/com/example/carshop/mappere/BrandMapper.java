package com.example.carshop.mappere;

import com.example.carshop.DTO.BrandDTO;
import com.example.carshop.entity.Brand;
import org.mapstruct.Mapper;

@Mapper
public interface BrandMapper {
    Brand DtoToEntity (BrandDTO brandDTO);
    BrandDTO EntityToDto (Brand brand);

}
