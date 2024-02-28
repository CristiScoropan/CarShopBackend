package com.example.carshop.repository;

import com.example.carshop.entity.Truck;
import com.example.carshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    @Query(value = "SELECT * FROM users u WHERE u.name=?1",nativeQuery = true)
    User findUserByName (String name);
}
