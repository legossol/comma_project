package com.example.demo.uss.repository;


import com.example.demo.uss.domain.User;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long>{

    @Modifying
    @Query(value ="insert into users(name,username,password,email,age,birthday,gender,regdate,phone) values(:name,:username,:password,:email,:age,:birthday,:gender,:regdate,:phone)", nativeQuery=true)
    void sampleData(@Param("name")String name, @Param("username")String username, @Param("password")String password, @Param("email")String email, @Param("age")String age, @Param("birthday")String birthday, @Param("gender")String gender, @Param("regdate")String regdate, @Param("phone")String phone);
}
