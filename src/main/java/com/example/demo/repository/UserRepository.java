package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select uu from User uu where uu.email = :email and uu.password = :password")
    List<User> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
