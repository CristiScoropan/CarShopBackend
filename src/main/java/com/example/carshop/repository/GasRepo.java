package com.example.carshop.repository;

import com.example.carshop.entity.Gas;
import com.example.carshop.entity.Models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GasRepo extends JpaRepository<Gas,Long> {
    @Query(value = "SELECT * FROM gas g WHERE g.gas_type=?1",nativeQuery = true)
    Gas findGasByName(String name);

}
