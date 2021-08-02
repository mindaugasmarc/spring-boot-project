package com.example.demo.repository;


import com.example.demo.model.OrderCart;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderCartRepository extends CrudRepository<OrderCart, Integer> {

}
