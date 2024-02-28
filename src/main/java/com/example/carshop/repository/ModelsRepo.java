package com.example.carshop.repository;

import com.example.carshop.entity.Models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelsRepo extends JpaRepository<Models,Long> {
    @Query(value = "SELECT * FROM models m WHERE m.model_name=?1", nativeQuery = true)
    Models findModelByName(String name);
}
