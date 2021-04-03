package com.example.demo.cbs.repository;

import java.util.List;

import com.example.demo.cbs.domain.Board;
import com.example.demo.uss.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepo extends JpaRepository<Board,Long>{


    

}
