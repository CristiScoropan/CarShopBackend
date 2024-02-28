package com.example.carshop.DTO;

import com.example.carshop.entity.Models;
import com.example.carshop.entity.VehicleType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandDTO {
    private String brandName;
    private List<Models> models;
    private VehicleType vehicleType;
}
