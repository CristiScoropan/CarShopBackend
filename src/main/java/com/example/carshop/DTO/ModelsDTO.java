package com.example.carshop.DTO;

import com.example.carshop.entity.VehicleType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelsDTO {
    private Long id;
    private String modelName;
    private VehicleType vehicleType;
}
