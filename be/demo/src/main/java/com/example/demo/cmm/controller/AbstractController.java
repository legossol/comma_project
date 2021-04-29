package com.example.demo.cmm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class AbstractController<T> {
    //T findById(long id),List<T> findAll(),long count(),T getOne(long id),long delete(T t)
    // Boolean existBy(long id)
    
    public abstract ResponseEntity<Long> save(T t);
    public abstract ResponseEntity<Optional<T>> findById(long id);
    public abstract ResponseEntity<List<T>>  findAll();
    public abstract ResponseEntity<Long> count();
    public abstract ResponseEntity<Optional<T>> getOne(long id);
    public abstract ResponseEntity<Long>  delete(T t);
    public abstract ResponseEntity<Boolean> existsById(long id);
    
}
