package com.example.demo.uss.repository;


import java.util.*;

import com.example.demo.uss.domain.User;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    @Modifying
    @Query(value = "insert into users (name, age, email, phoneNumber, phone_number) values (:name, :age :email, :phoneNumber, :phone_number)", nativeQuery = true)
    void insertUser(@Param("name") String name, @Param("age") String age, 
    @Param("email") String email, @Param("phoneNumber") String phoneNumber, @Param("phone_number") String phone_number);
    //Create

    @Query("select * from User u")
    List<User> findAllUsers(Sort sort);
    
    //Read
    @Modifying
    @Query(value = "update users u set  where u.name = ? u.age = ? u.email = ? u.phoneNumber = ?", 
        nativeQuery = true)
    int updateUserSetStatusForNameNative(Integer name, String age, String email, String phoneNumber);    
    
      //update
    @Modifying
    @Query("delete u from users u where u.name=:name)
    void deleteUser(@Param("name")String name);
    //delete



    
    //@Query(value="SELECT * FROM USER", nativeQuery=true)
}
