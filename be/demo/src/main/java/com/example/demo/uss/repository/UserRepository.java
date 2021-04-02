package com.example.demo.uss.repository;


import java.util.*;
import java.util.function.BiPredicate;

import com.example.demo.uss.domain.User;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public interface UserRepository extends JpaRepository<User, Long>{
        List<User> findAll();

   BiPredicate<User,User> checkUser = (n1,n2)-> n1.equals(n2);

        @Transactional
       @Query(value = "select username, password from users where username= :username and password = :password",nativeQuery = true)
       public User login(
           @Param("username") String username,
           @Param("password") String password);
}
