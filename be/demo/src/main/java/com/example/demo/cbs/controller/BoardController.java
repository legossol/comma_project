package com.example.demo.cbs.controller;

import java.util.List;

import com.example.demo.cbs.domain.Board;
import com.example.demo.cbs.service.BoardService;
import com.example.demo.cbs.service.BoardServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/campaign")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class BoardController {
    
    public final BoardServiceImpl service;

    @GetMapping("/List")
    public List<Board> boardList(){
        return service.findAll();
    }
    @PostMapping("/create")
    public ResponseEntity<?> createCmp(@RequestBody Board board) throws Exception{
        System.out.println("create 진입");
        service.createBoardOne(board);
        return new ResponseEntity<>(HttpStatus.OK);
    } 
    
}
