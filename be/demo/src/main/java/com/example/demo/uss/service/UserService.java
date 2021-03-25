package com.example.demo.uss.service;

import java.util.*;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;

import org.springframework.data.domain.Sort;

public interface UserService {
    public Optional<User> findOne(User t);
	public long count();
	boolean existsById(long id);
	public List<UserDto> findAll(Sort sort);
	public Optional<UserDto> findOne();
	public void deleteById(long id);
	public User getOnt(long id);
	public void register(UserDto dto);
    
}
