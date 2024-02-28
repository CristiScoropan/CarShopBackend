package com.example.carshop.mappere;

import com.example.carshop.DTO.AnuntDTO;
import com.example.carshop.entity.Anunt;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T14:27:43+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4 (Oracle Corporation)"
)
public class AnuntMapperImpl implements AnuntMapper {

    @Override
    public Anunt DTOToEntity(AnuntDTO anuntDTO) {
        if ( anuntDTO == null ) {
            return null;
        }

        Anunt anunt = new Anunt();

        return anunt;
    }

    @Override
    public AnuntDTO EntityToDTO(Anunt anunt) {
        if ( anunt == null ) {
            return null;
        }

        AnuntDTO anuntDTO = new AnuntDTO();

        return anuntDTO;
    }
}
