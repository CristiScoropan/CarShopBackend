package com.example.carshop.mappere;

import com.example.carshop.DTO.GasDTO;
import com.example.carshop.entity.Gas;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T14:27:43+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4 (Oracle Corporation)"
)
public class GasMapperImpl implements GasMapper {

    @Override
    public Gas DTOToEntity(GasDTO gasDTO) {
        if ( gasDTO == null ) {
            return null;
        }

        Gas gas = new Gas();

        return gas;
    }

    @Override
    public GasDTO EntityToDTO(Gas gas) {
        if ( gas == null ) {
            return null;
        }

        GasDTO gasDTO = new GasDTO();

        return gasDTO;
    }
}
