package com.example.carshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "brand_names")
public class Brand{
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "brand_name")
    private String brandName;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id")
    private List<Models> models;
    private VehicleType vehicleType;

}
