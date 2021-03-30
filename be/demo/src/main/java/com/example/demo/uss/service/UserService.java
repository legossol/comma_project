package com.example.demo.uss.service;

import java.util.List;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;;

public interface UserService {
	public User findByNo(Long id);
	void updateById(Long no, User user);
	User findUserById(Long no);
	
}
