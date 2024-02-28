package com.example.carshop.DTO;

import com.example.carshop.entity.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaroserieDTO {
    private String name;
    private VehicleType vehicleType;
}
