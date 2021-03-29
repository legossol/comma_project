package com.example.demo.uss.repository;


import java.util.*;

import com.example.demo.uss.domain.User;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
  
  // List<User> findAll();

  
}
