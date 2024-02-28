package com.example.carshop.DTO;

import com.example.carshop.entity.Car;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnuntDTO {
    private Car car;
    private String poza;
    private String description;
    private Double price;
}
