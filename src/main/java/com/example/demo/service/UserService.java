package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public boolean isValidCredentials(String email, String password) {

        List<User> users = userRepo.findByEmailAndPassword(email, password);

        boolean userExists = users.size() == 1;

        return userExists;



    }


}


