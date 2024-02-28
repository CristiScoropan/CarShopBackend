package com.example.carshop.repository;

import com.example.carshop.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TruckRepo extends JpaRepository<Truck,Long> {
    @Query(value = "SELECT * FROM trucks t WHERE t.brandTruck=?1 and t.caroserieTruck=?2 and t.gas=?3 and t.modelsTruck=?4 and t.km=?5 and t.price=?6 and t.year=?7",nativeQuery = true)
    List <Truck> filterTrucks (Brand brand, Caroserie caroserie, Gas gas, Models models, int km, int price, int year);
}
