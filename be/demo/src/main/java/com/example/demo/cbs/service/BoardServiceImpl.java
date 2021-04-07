package com.example.demo.cbs.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cbs.domain.Board;
import com.example.demo.cbs.repository.BoardRepo;
import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceImpl extends AbstractService<Board> implements BoardService{

    public final BoardRepo repo;

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean existsById(long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Board> findAll() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }

    @Override
    public Optional<Board> findOne() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Board getOne(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User save(Board entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User findById(long id) {
        // TODO Auto-generated method stub
        return repo;
    }

    @Override
    public User checkLogin(Board entity) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Board createBoard(Board entity) {
        // TODO Auto-generated method stub
        return repo.save(entity);
    }

    @Override
    public Board findBycno(long cno) {
        Board board = repo.findById(cno).orElseThrow();
        return board;
    }
    
}