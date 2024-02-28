package com.example.carshop.mappere;

import com.example.carshop.DTO.GasDTO;
import com.example.carshop.entity.Gas;
import org.mapstruct.Mapper;

@Mapper
public interface GasMapper {
    Gas DTOToEntity (GasDTO gasDTO);
    GasDTO EntityToDTO (Gas gas);
}
