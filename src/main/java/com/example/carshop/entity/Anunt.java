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
@Table(name = "anunturi")
public class Anunt {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(targetEntity = Car.class)
    private Car car;
    @Column(name = "descriere")
    private String description;
    @Column(name = "price")
    private Integer price;
    @Column(name = "poze")
    private String poza;
}
