package com.example.carshop.repository;

import com.example.carshop.DTO.BikeDTO;
import com.example.carshop.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRepo extends JpaRepository<Bike,Long> {
    @Query(value = "SELECT * FROM bikes  b WHERE b.brandBike=?1 and b.caroserieBike=?2 and b.gas=?3 and b.modelsBike=?4 and b.km=?5 and b.price=?6 and b.year=?7",nativeQuery = true)
    List<Bike> filterBikes(Brand brand, Caroserie caroserie, Gas gas, Models models, int km, int price, int year);
}
