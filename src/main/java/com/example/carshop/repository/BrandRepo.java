package com.example.carshop.repository;

import com.example.carshop.entity.Brand;
import com.example.carshop.entity.Models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepo extends JpaRepository<Brand,Long> {
    @Query(value = "SELECT * FROM brand_names b WHERE b.brand_name=?1",nativeQuery = true)
    Brand findBrandByName(String brandName);


}
