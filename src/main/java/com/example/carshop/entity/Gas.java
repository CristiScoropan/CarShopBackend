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
@Table(name = "gas")
public class Gas {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "gas_type")
    private String type;
}
