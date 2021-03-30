package com.example.demo.uss.repository;


import java.util.*;

import com.example.demo.uss.domain.User;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Long>{
    User findByNo(@Param("no")Long no);
   List<User> findAll();
        User findUserById(Long no);
   
}
