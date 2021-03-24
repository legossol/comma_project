package com.example.demo.uss.forTest;

import com.example.demo.uss.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataTest implements CommandLineRunner{
    public void main(String[] args) {
        SpringApplication.run(DataTest.class, args);
    }
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String...args) throws Exception{
        this.userRepository.save(new User(""))
    }
    
}
