package com.example.demo.uss.service;

import java.util.List;
import java.util.function.BiPredicate;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;;

public interface UserService {
	public User login(String username, String password);
	
}
