package com.example.demo.uss.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{

    @Override
    public Optional<User> findOne(User t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean existsById(long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<UserDto> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<UserDto> findOne() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User getOnt(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User save(UserDto entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, Object> checkLoginIdDup(String userName) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
