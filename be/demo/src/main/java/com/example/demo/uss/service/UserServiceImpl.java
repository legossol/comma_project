package com.example.demo.uss.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class UserServiceImpl extends AbstractService<User> implements UserService{

    private final UserRepository repository;

    @Override
    public List<User> findUserAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User addUser(User user) {
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
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<User> findOne() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User getOne(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User save(User entity) {
        // TODO Auto-generated method stub
        return repository.save(entity);
    }

    @Override
    public void findById(long id) {
        // TODO Auto-generated method stub
        
    }

    // @Override
    // public List<User> findUserAll(){
    //     return repository.findAll();
    // }
    

}
