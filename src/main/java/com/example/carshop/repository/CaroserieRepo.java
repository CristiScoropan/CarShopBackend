package com.example.carshop.repository;


import com.example.carshop.entity.Caroserie;
import com.example.carshop.entity.Models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CaroserieRepo extends JpaRepository<Caroserie,Long> {
    @Query(value ="SELECT * FROM caroesrii c WHERE c.caroserie_name=?1",nativeQuery = true)
    Caroserie findCaroserieByName(String name);

}
