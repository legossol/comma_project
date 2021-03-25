package com.example.demo.uss.repository;


import java.util.List;

import com.example.demo.uss.domain.User;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Query("select * from users ")
    User findByUserByGender(String gender);

    @Modifying
    @Query("update user u set u. = :status where u.uerNo = :userNo")
    int updateUserSetStatusForName(@Param("status") Integer status, 
      @Param("name") String name);

    @Modifying
    @Query(value = "update users u set  where u.name = ? u.age = ? u.email = ? u.phoneNumber = ?", 
        nativeQuery = true)
      int updateUserSetStatusForNameNative(Integer name, String age, String email, String phoneNumber);    



    @Modifying
    @Query(value = "insert into users (name, age, email, phoneNumber) values (:name, :age :email, :phoneNumber)", nativeQuery = true)
    void insertUser(@Param("name") String name, @Param("age") String age, 
    @Param("email") String email, @Param("phoneNumber") String phoneNumber);

    //@Query(value="SELECT * FROM USER", nativeQuery=true)
}
