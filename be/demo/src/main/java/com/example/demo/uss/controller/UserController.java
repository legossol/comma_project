package com.example.demo.uss.controller;
import java.util.*;

import javax.servlet.http.HttpSession;

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
import org.springframework.web.bind.annotation.*;



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
    @GetMapping("/{userno}")
    public ResponseEntity<User> getUser(@PathVariable("userno")Long userno){
        return new ResponseEntity<User>(service.findById(userno),HttpStatus.OK);
    }

    @PutMapping("/{userno}")
       public ResponseEntity<User> updateUser(@PathVariable("userno") Long userno, @RequestBody User user) {
            System.out.println("update진입");
            user.getUserno();
            service.save(user);
           

             return new ResponseEntity<User>(user, HttpStatus.OK);
       }
    @DeleteMapping("/{userno}")
    public ResponseEntity<Void> deleteUser(@PathVariable("userno") Long userno){
        service.delete(userno);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/login/{userno}")
    public  ResponseEntity<User> loginUser(@RequestBody User user, HttpSession session){
        User result  = service.checkLogin(user);
        if(result==null){
            System.out.println("id나 pw가 틀렸거나 계정이 없습니다.");
            
        }else{
            session.setAttribute("userName", result.getUsername());
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
