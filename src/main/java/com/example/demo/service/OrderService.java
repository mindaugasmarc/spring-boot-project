package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    UserRepository userRepo;
    OrderRepository orderRepo;

//    public Order addNewOrder(User user, double total_price, String order_date) {
//
//        Order newOrder = new Order();
//        newOrder.setTotal_price(total_price);
//        newOrder.setOrder_date(order_date);
//
//        orderRepo.save(newOrder);
//
//        return newOrder;
//
//    }


}
