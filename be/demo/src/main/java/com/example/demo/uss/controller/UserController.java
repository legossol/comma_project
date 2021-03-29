package com.example.demo.uss.controller;
import java.util.*;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.service.UserServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;


@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UserController {
    private final UserServiceImpl service;

    @PostMapping("/join")
    public ResponseEntity<?> save(@RequestBody User user) throws Exception{
        System.out.println("등록");
        // log.info("등록완료");
        service.save(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
