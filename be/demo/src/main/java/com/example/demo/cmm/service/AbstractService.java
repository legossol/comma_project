package com.example.demo.cmm.service;

import java.util.*;

import com.example.demo.cbs.domain.Board;
import com.example.demo.uss.domain.User;

public abstract class AbstractService<T> {

    // public abstract long count();
    // public abstract boolean existsById(long id);
    // public abstract List<T> findAll();
    public abstract Optional<T> findOne();
    public abstract void deleteById(long id);
    // public abstract T getOne(long id);
    // public abstract User save(T entity);
    // public abstract User findById(long id);
    public abstract User checkLogin(T entity);
    public abstract Board createBoard(T entity);
    public abstract Board findBycno(long id);
    //
    public abstract Long save(T t);
    public abstract Optional<T> findById(long id);
    public abstract List<T> findAll();
    public abstract Long count();
    public abstract Optional<T> getOne(long id);
    public abstract Long delete(T t);
    public abstract Boolean existsById(long id);
}
