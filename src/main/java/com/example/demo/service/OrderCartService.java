package com.example.demo.service;


import com.example.demo.model.Menu;
import com.example.demo.model.OrderCart;
import com.example.demo.model.User;
import com.example.demo.repository.MenuRepository;
import com.example.demo.repository.OrderCartRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCartService {

    @Autowired
    UserRepository userRepo;

    @Autowired
    MenuRepository menuRepo;

    @Autowired
    OrderCartRepository ocRepo;

    public OrderCart addNewCart(User user, Menu menuItem, double price) {

        OrderCart newOrder = new OrderCart();
        newOrder.setUser(user);
        newOrder.setMenu(menuItem);
        newOrder.setPrice(price);

        newOrder = ocRepo.save(newOrder);

        return newOrder;
    }
}
