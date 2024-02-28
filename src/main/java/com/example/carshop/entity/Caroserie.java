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
@Table(name = "caroesrii")
public class Caroserie {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "caroserie_name")
    private String name;
    private VehicleType vehicleType;

}
