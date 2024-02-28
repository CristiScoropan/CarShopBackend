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
@AllArgsConstructor
@NoArgsConstructor
public class BikeDTO {
    private String price;
    private String year;
    private String km;
    private Caroserie caroserieBike;
    private Gas gas;
    private Brand brandBike;
    private Models modelsBike;
}
