package com.example.demo.uss.controller;
import java.util.function.Function;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String createUser(){
        return "user/login/register";
        }
    @PostMapping("/login")
    public String createUser(UserDto dto){
        //System.out.println(dto);
        userService.register(dto);
        return "redirect:/";
    }
    
    // public String doLogin(HttpSession session, String userName, String password){
        // if(userName.equals("masterUser")&& password.equals("1234")){
        //     session.setAttribute("isLogined", "OK");

        //     return "마스터 계정 로그인 완료";
        // }else{
        //     return "마스터 계정이 올바르게 입력되지 않았습니다.";
        // }

        // BiFunction<String, String, String> ms = (userName, password, return) ->  ? "마스터 계정 로그인 완료" : "마스터 계정이 올바르게 입력되지 않았습니다.";
        //apply

    
    
    
}
