package com.example.carshop.Service;

import com.example.carshop.DTO.BikeDTO;
import com.example.carshop.entity.*;
import com.example.carshop.mappere.BikeMapper;
import com.example.carshop.repository.*;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;

@Service
public class BikeService {
    private final BikeRepo bikeRepo;
    private final BrandRepo brandRepo;
    private final ModelsRepo modelsRepo;
    private final GasRepo gasRepo;
    private final CaroserieRepo caroserieRepo;
    private final BikeMapper bikeMapper;

    public BikeService(BikeRepo bikeRepo, BrandRepo brandRepo, ModelsRepo modelsRepo, GasRepo gasRepo, CaroserieRepo caroserieRepo, BikeMapper bikeMapper) {
        this.bikeRepo = bikeRepo;
        this.brandRepo = brandRepo;
        this.modelsRepo = modelsRepo;
        this.gasRepo = gasRepo;
        this.caroserieRepo = caroserieRepo;
        this.bikeMapper = bikeMapper;
    }


    public BikeDTO addBike (BikeDTO bikeDTO){

        if(bikeMapper.DTOToEntity(bikeDTO).getBrandBike().equals(VehicleType.BIKE) && bikeMapper.DTOToEntity(bikeDTO).getCaroserieBike().getVehicleType().equals(VehicleType.BIKE) && bikeMapper.DTOToEntity(bikeDTO).getModelsBike().getVehicleType().equals(VehicleType.BIKE)){
            return bikeMapper.EntityToDTO(bikeRepo.save(bikeMapper.DTOToEntity(bikeDTO)));
        }
        else
            throw new InvalidParameterException("Either the brand,model or caroserie name is not suitable for this type of vehicle");
    }

    public BikeDTO modifyBike (BikeDTO bikeDTO,Long idBike){
        if(bikeMapper.DTOToEntity(bikeDTO).getBrandBike().getVehicleType().equals(VehicleType.BIKE) && bikeMapper.DTOToEntity(bikeDTO).getCaroserieBike().getVehicleType().equals(VehicleType.BIKE) && bikeMapper.DTOToEntity(bikeDTO).getModelsBike().getVehicleType().equals(VehicleType.BIKE)){
            Bike bike = bikeRepo.getById(idBike);
            bike.setBrandBike(bikeDTO.getBrandBike());
            bike.setCaroserieBike(bikeDTO.getCaroserieBike());
            bike.setModelsBike(bikeDTO.getModelsBike());
            bike.setKm(bikeDTO.getKm());
            bike.setGas(bikeDTO.getGas());
            bike.setYear(bikeDTO.getYear());
            bike.setPrice(bikeDTO.getPrice());
            return bikeMapper.EntityToDTO(bikeRepo.save(bike));
        }
        else
            throw new InvalidParameterException("Either the brand,model or caroserie name is not suitable for this type of vehicle");
    }
    public List<BikeDTO> filteredbikes (BikeDTO bikeDTO) {
        Brand brand = bikeMapper.DTOToEntity(bikeDTO).getBrandBike();
        Caroserie caroserie = bikeMapper.DTOToEntity(bikeDTO).getCaroserieBike();
        Models models = bikeMapper.DTOToEntity(bikeDTO).getModelsBike();
        Gas gas = bikeMapper.DTOToEntity(bikeDTO).getGas();
        return bikeMapper.EntitiesToDTOs(bikeRepo.filterBikes(brand, caroserie, gas, models, bikeDTO.getKm(), bikeDTO.getPrice(), bikeDTO.getYear()));
    }
}
