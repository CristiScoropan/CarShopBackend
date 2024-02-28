package com.example.carshop.Service;

import com.example.carshop.DTO.TruckDTO;
import com.example.carshop.entity.*;
import com.example.carshop.mappere.TruckMapper;
import com.example.carshop.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class TruckService {
    private final TruckMapper truckMapper;
    private final  TruckRepo truckRepo;
    private final  BrandRepo brandRepo;

    private final  ModelsRepo modelsRepo;

    private final  GasRepo gasRepo;
    private final  CaroserieRepo caroserieRepo;

    public TruckService(TruckRepo truckRepo, BrandRepo brandRepo, ModelsRepo modelsRepo, GasRepo gasRepo, CaroserieRepo caroserieRepo, TruckMapper truckMapper) {
        this.truckRepo = truckRepo;
        this.brandRepo = brandRepo;
        this.modelsRepo = modelsRepo;
        this.gasRepo = gasRepo;
        this.caroserieRepo = caroserieRepo;
        this.truckMapper = truckMapper;
    }

    public TruckDTO addTruck(TruckDTO truckDTO){
        Truck truck = truckMapper.DTOToEntity(truckDTO);
        truckRepo.save(truck);
        return truckMapper.EntityToDTO(truck);
    }

    public TruckDTO modifyTruck(TruckDTO truckDTO, Long idTruck) {
        Truck truckEntity = truckMapper.DTOToEntity(truckDTO);

        // Check if the brand, caroserie, and models are suitable for TRUCK
        if (truckEntity.getBrandTruck().getVehicleType().equals(VehicleType.TRUCK) &&
                truckEntity.getCaroserieTruck().getVehicleType().equals(VehicleType.TRUCK) &&
                truckEntity.getModelsTruck().getVehicleType().equals(VehicleType.TRUCK)) {

            Truck truck = truckRepo.findById(idTruck)
                    .orElseThrow(() -> new NoSuchElementException("Truck not found with id: " + idTruck));

            // Update the truck entity with DTO data
            truck.setBrandTruck(truckEntity.getBrandTruck());
            truck.setCaroserieTruck(truckEntity.getCaroserieTruck());
            truck.setModelsTruck(truckEntity.getModelsTruck());
            truck.setKm(truckDTO.getKm());
            truck.setGas(truckDTO.getGas());
            truck.setYear(truckDTO.getYear());
            truck.setPrice(truckDTO.getPrice());

            // Save the updated truck entity
            return truckMapper.EntityToDTO(truckRepo.save(truck));
        } else {
            throw new InvalidParameterException("Either the brand, model, or caroserie name is not suitable for this type of vehicle");
        }
    }

    public List<TruckDTO> filteredTrucks(String brandName, String caroserieName, String gasName, String modelName, int km, int price, int year){
        Brand brand = brandRepo.findBrandByName(brandName);
        Caroserie caroserie = caroserieRepo.findCaroserieByName(caroserieName);
        Models models = modelsRepo.findModelByName(modelName);
        Gas gas = gasRepo.findGasByName(gasName);
        List<Truck> trucks = truckRepo.filterTrucks(brand, caroserie, gas, models, km, price, year);
        return trucks.stream().map(truckMapper::EntityToDTO).collect(Collectors.toList());
    }
}
