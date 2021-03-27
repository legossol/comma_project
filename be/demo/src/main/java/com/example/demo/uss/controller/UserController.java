package com.example.demo.uss.controller;
import java.util.*;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.repository.UserRepository;
import com.example.demo.uss.service.UserService;
import com.example.demo.uss.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;


@RestController
@Log
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UserController {
    private UserServiceImpl Service;

    // @GetMapping("/list")
    // public String list(Model model){
    //     List<User> userList = userRepository.findAll();
    //     model.addAttribute("userList",userList);

    //     return "list";
    // }

    @RequestMapping(value = "/join")
    public ResponseEntity<?> save(@RequestBody User user) throws Exception{
        log.info("등록완료");
        Service.save(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
