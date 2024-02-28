package com.example.carshop.DTO;

import com.example.carshop.entity.Anunt;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String name;
    private String password;
    private List<Anunt> favorite;
}
