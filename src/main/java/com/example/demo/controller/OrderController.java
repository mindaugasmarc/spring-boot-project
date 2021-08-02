package com.example.demo.controller;


import com.example.demo.model.Menu;
import com.example.demo.model.OrderCart;
import com.example.demo.model.User;
import com.example.demo.repository.MenuRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.OrderCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class OrderController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    OrderCartService ocService;

    @RequestMapping("/validOrder")
    public @ResponseBody
    String addExampleItem(@RequestParam int userId, @RequestParam int menuItemId, @RequestParam double price) {

        User user = userRepository.findById(userId).get();
        Menu menuItem = menuRepository.findById(menuItemId).get();

        OrderCart orderCart = new OrderCart();
        ocService.addNewCart(user, menuItem, price);

        String output = "User: " + user.getName() + " has ordered: " + menuItem.getItem_name() + " for " + price + " Eur.";

        return output;
    }
}





