package com.example.carshop.Service;

import com.example.carshop.DTO.AnuntDTO;
import com.example.carshop.entity.Anunt;
import com.example.carshop.entity.Car;
import com.example.carshop.mappere.AnuntMapper;
import com.example.carshop.repository.AnuntRepo;
import com.example.carshop.repository.CarRepo;
import org.springframework.stereotype.Service;

@Service
public class AnuntService {
    private final AnuntRepo anuntRepo;
    private final CarRepo carRepo;
    private final AnuntMapper anuntMapper;

    public AnuntService(AnuntRepo anuntRepo, CarRepo carRepo,AnuntMapper anuntMapper) {
        this.anuntRepo = anuntRepo;
        this.carRepo = carRepo;
        this.anuntMapper = anuntMapper;
    }

    public AnuntDTO addAnunt (AnuntDTO anuntDTO){
        return anuntMapper.EntityToDTO(anuntRepo.save(anuntMapper.DTOToEntity(anuntDTO)));
    }

    public AnuntDTO modifyAnunt (Long id,AnuntDTO anuntDTO){
        Anunt anunt = anuntRepo.getById(id);
        anunt.setPoza(anuntDTO.getPoza());
        anunt.setCar(anuntDTO.getCar());
        return anuntMapper.EntityToDTO(anuntRepo.save(anunt));
    }
}
