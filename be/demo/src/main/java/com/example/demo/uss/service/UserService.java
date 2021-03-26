package com.example.demo.uss.service;

import com.example.demo.uss.domain.UserDto;;

public interface UserService {
	public void register(UserDto dto);
	public void pushSampleData(UserDto dto);
}
