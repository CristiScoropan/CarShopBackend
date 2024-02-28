package com.example.carshop.repository;

import com.example.carshop.entity.Anunt;
import com.example.carshop.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnuntRepo extends JpaRepository<Anunt,Long> {

}
