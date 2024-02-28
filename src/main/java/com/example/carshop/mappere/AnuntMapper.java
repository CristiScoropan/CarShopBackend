package com.example.carshop.mappere;

import com.example.carshop.DTO.AnuntDTO;
import com.example.carshop.entity.Anunt;
import org.mapstruct.Mapper;

@Mapper
public interface AnuntMapper {
    Anunt DTOToEntity (AnuntDTO anuntDTO);
    AnuntDTO EntityToDTO (Anunt anunt);
}
