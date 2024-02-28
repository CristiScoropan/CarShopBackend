package com.example.carshop.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarPartDTO {
    private Long Id;
    private String partName;
    private String manufacturer;
    private Integer price;
}

