package com.example.demo.uss.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
@Service
@AllArgsConstructor
public class UserServiceImpl extends AbstractService<User> implements UserService{

    private final UserRepository repository;


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
        return repository.findAll();
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
        return null;
    }

    @Override
    public void findById(long id) {
        // TODO Auto-generated method stub
        
    }
    @Transactional
    public User update(Long id, User newUser){
        User user = repository.findByNo(id);
        user.setEmail(newUser.getEmail());

        return repository.save(user);
    }

    @Override
    public User findByNo(Long id) {
        // TODO Auto-generated method stub
        return repository.findByNo(id);
    }
    @Transactional
    public void delete(Long id){
        User user = repository.findByNo(id);
        repository.delete(user);
    }
}
