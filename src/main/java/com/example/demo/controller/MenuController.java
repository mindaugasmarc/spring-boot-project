package com.example.demo.controller;

import com.example.demo.model.Menu;
import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.repository.MenuRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class MenuController {

    @Autowired
    MenuRepository menuRepo;

    @RequestMapping("/menu")
    public String getMenu(Model model)
    {
        List<Menu> items = menuRepo.findAll();

        model.addAttribute("menuItems", items);

        // items = (List<Menu>) model.getAttribute("menuItems");
        return "menu";
    }

}
