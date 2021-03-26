package com.example.demo.uss.controller;
import java.util.*;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.repository.UserRepository;
import com.example.demo.uss.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/list")
    public String list(Model model){
        List<User> userList = userRepository.findAll();
        model.addAttribute("userList",userList);

        return "list";
    }

}
