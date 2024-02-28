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
@Table(name = "bikes")
public class Bike {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "price")
    private int price;
    @Column(name = "year")
    private int year;
    @Column(name = "km")
    private int km;
    @OneToOne(targetEntity = Caroserie.class)
    private Caroserie caroserieBike;
    @OneToOne(targetEntity = Gas.class)
    private Gas gas;
    @OneToOne(targetEntity = Brand.class)
    private Brand brandBike;
    @OneToOne(targetEntity = Models.class)
    private Models modelsBike;

}

