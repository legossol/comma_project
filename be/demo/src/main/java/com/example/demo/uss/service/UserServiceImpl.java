package com.example.demo.uss.service;
import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;
    
    @Override
    public void register(UserDto dto) {
        repository.save(dto.toEntity());
    }    

    @Override
    public void pushSampleData(UserDto dto){
        repository.sampleData("해솔", "ssol", "1234", "ssol@gamil.com", "30", "1992-04-25", "M", "2021-02-21", "01049380425");
    }
    
}
