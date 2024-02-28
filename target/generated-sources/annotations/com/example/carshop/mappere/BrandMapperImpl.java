package com.example.carshop.mappere;

import com.example.carshop.DTO.BrandDTO;
import com.example.carshop.entity.Brand;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T14:27:42+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4 (Oracle Corporation)"
)
public class BrandMapperImpl implements BrandMapper {

    @Override
    public Brand DtoToEntity(BrandDTO brandDTO) {
        if ( brandDTO == null ) {
            return null;
        }

        Brand brand = new Brand();

        return brand;
    }

    @Override
    public BrandDTO EntityToDto(Brand brand) {
        if ( brand == null ) {
            return null;
        }

        BrandDTO brandDTO = new BrandDTO();

        return brandDTO;
    }
}
