package com.example.demo.uss.service;
import java.util.List;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findUserAll(){
        return repository.findAll();
    }

}
