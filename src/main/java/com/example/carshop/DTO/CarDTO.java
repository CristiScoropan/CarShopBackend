package com.example.carshop.DTO;

import com.example.carshop.entity.Brand;
import com.example.carshop.entity.Caroserie;
import com.example.carshop.entity.Gas;
import com.example.carshop.entity.Models;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    private String price;
    private String year;
    private String km;
    private Caroserie caroserie;
    private Gas gas;
    private Brand brand;
    private Models models;
}
