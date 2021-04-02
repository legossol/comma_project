package com.example.demo.uss.controller;
import java.util.*;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;
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

    @GetMapping("/login/{username}/{password}")
	public ResponseEntity<User> doLogin(@PathVariable("username")String username, @PathVariable("password")String password ){
		System.out.println("로그인 진입");
		User u = service.login(username,password);
		
		return new ResponseEntity<>(u, HttpStatus.OK);
	}
    // @PostMapping("/login")
    // public ResponseEntity<User> postLogin(@RequestBody User user, HttpSession Session) {
        
    //     User u = service.login(user.getUsername(),user.getPassword());
    //     // if(u != null){
    //     //     System.out.println("Login Seccess");
    //     //     Session.setAttribute("userLoginInfo", u);
    //     // }
    //     if(u.equals(idcheck,pwcheck)){
    //         System.out.println("이름 비번 같다ㅏ!!");
    //     }else{  
    //         System.out.println("뭔가 잘못됫다");

    //     }
    //     return new ResponseEntity<User>(u, HttpStatus.OK);
    // }
}
