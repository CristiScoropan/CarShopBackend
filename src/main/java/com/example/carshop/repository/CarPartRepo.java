package com.example.carshop.repository;

import com.example.carshop.entity.Car;
import com.example.carshop.entity.CarPart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarPartRepo extends JpaRepository<CarPart, Long> {
    @Query(value ="SELECT * FROM car_parts c WHERE c.part_name=?1 and c.manufacturer=?2 and c.price=?3",nativeQuery = true)
    List<CarPart> findByPartName(String partName);
}
