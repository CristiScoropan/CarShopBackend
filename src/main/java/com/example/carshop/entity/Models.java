package com.example.carshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "models")
public class Models {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "model_name")
    private String modelName;
    private VehicleType vehicleType;
}
