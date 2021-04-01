package com.example.demo.uss.repository;


import java.util.*;
import java.util.function.BiPredicate;

import com.example.demo.uss.domain.User;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Long>{
        List<User> findAll();

   BiPredicate<User,User> checkUser = (n1,n2)-> n1.equals(n2);

       @Query(value = "select u from user u where u.username = :username and u.password = :password")
       List<User> findByUserName(
           @Param("username") String username,
           @Param("password") String password);

}
