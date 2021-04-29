package com.example.demo.review.controller;

import com.example.demo.cmm.controller.*;
import com.example.demo.review.domain.Review;
import com.example.demo.review.service.ReviewService;
import com.example.demo.review.service.ReviewServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController @RequiredArgsConstructor
public class ReviewController extends AbstractController<Review>  {

    private final ReviewServiceImpl service;
    @PostMapping("")
    public ResponseEntity<Long> save(Review review) {
        return ResponseEntity.ok(service.save(review));
    }

    @Override
    public ResponseEntity<Optional<Review>> findById(long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Review>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Long> count() {
        return null;
    }

    @Override
    public ResponseEntity<Optional<Review>> getOne(long id) {
        return null;
    }

    @Override
    public ResponseEntity<Long> delete(Review review) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> existsById(long id) {
        return null;
    }
}