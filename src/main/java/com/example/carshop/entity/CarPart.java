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
@Table(name = "car_parts")
public class CarPart {
    @Id
    @GeneratedValue
    private long Id;
    @Column(name = "part_name")
    private String partName;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "price")
    private Integer price;

}
