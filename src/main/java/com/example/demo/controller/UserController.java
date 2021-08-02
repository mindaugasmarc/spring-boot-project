package com.example.demo.controller;

import com.example.demo.model.Menu;
import com.example.demo.model.User;
import com.example.demo.repository.MenuRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    MenuRepository menuRepo;

    @Autowired
    UserService userService;

    @GetMapping("/registerForm")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String surname,
                                           @RequestParam String email, @RequestParam String password) {

        User n = new User();
        n.setName(name);
        n.setSurname(surname);
        n.setEmail(email);
        n.setPassword(password);
        userRepository.save(n);
        return "You have signed up successfully!";

    }

    @RequestMapping("/homepage")
    public String checkUser(Model model, @RequestParam String email, @RequestParam String password) {

        boolean isValid = userService.isValidCredentials(email, password);

        if (isValid) {
            List<Menu> items = menuRepo.findAll();

            model.addAttribute("menuItems", items);

            return "menu";

        } else {
            return "The user could not be found";
        }


    }


}
