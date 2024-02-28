package com.example.carshop.repository;


import com.example.carshop.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car,Long> {
    @Query(value ="SELECT * FROM cars c WHERE c.brand=?1 and c.caroserie=?2 and c.gas=?3 and c.models=?4 and c.km=?5 and c.price=?6 and c.year=?7",nativeQuery = true)
    List<Car> filterCars(Brand brand, Caroserie caroserie, Gas gas, Models models, int km, int price, int year);

}
