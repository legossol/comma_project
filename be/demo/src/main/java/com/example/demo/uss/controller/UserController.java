package com.example.demo.uss.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;
import com.example.demo.uss.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
public class UserController {
    @Autowired
    UserService UserService;

    @RequestMapping("/Users/join")
    public String showJoin(){
        return "Users/join";
    }
    @RequestMapping("/Users/doJoin")
    public String doJoin(@RequestParam Map<String, Object> param){
        Map<String, Object> checkLoginIdDupRs =  UserService.checkLoginIdDup((String)param.get("userName"));
        return "Ok";

    }
    @RequestMapping("/Users/logOut")
    public String doLogOut(){
        return "Users/logOut";
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
