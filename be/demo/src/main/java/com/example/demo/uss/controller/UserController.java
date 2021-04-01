package com.example.demo.uss.controller;
import java.util.*;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UserController {
    private final UserServiceImpl service;

    @PostMapping("/join")
    public ResponseEntity<?> save(@RequestBody User user) throws Exception{
        System.out.println("등록완료");
        service.save(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }
 
    @GetMapping(value = "/list")
    public List<User> getUserList() {
        return service.findAll();
    }
    @GetMapping("/{no}")
    public ResponseEntity<User> getUser(@PathVariable("no")Long no){
        return new ResponseEntity<User>(service.findById(no),HttpStatus.OK);
    }

    @PutMapping("/{no}")
       public ResponseEntity<User> updateUser(@PathVariable("no") Long no, @RequestBody User user) {
            System.out.println("update진입");
             service.updateById(no, user);

             return new ResponseEntity<User>(user, HttpStatus.OK);
       }
    @DeleteMapping("/{no}")
    public ResponseEntity<Void> deleteUser(@PathVariable("no") Long no){
        service.delete(no);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
