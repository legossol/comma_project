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
       @Query(value = "select userno, username, password from user u where u.username='username' and u.password ='password'",nativeQuery = true)
       public User login(
           @Param("userno") long userno,
           @Param("username") String username,
           @Param("password") String password);
        //    @Query(value="select user_id userNo, username, password from users where username='username' and password='password'", nativeQuery = true)
        //    public User login(@Param("userNo") long userNo, @Param("username") String username, @Param("password") String password);
}
