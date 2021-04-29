package com.example.demo.review.service;

import com.example.demo.cbs.domain.Board;
import com.example.demo.cmm.service.AbstractService;
import com.example.demo.review.domain.Review;
import com.example.demo.review.repository.ReviewRepository;
import com.example.demo.uss.domain.User;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
public class ReviewServiceImpl extends AbstractService<Review> implements ReviewService {
    private final ReviewRepository repository;
    @Override
    public Long save(Review review) {
        return (repository.save(review) != null) ? 1L : 0L;
    }

    @Override
    public Optional<Review> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Review> findAll() {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public Optional<Review> getOne(long id) {
        return Optional.empty();
    }

    @Override
    public Long delete(Review review) {
        return null;
    }

    @Override
    public Boolean existsById(long id) {
        return null;
    }

    @Override
    public Optional<Review> findOne() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User checkLogin(Review entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Board createBoard(Review entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Board findBycno(long id) {
        // TODO Auto-generated method stub
        return null;
    }
}