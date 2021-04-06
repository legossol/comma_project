package com.example.demo.cbs.controller;

import java.util.List;

import com.amazonaws.Response;
import com.example.demo.cbs.domain.Board;
import com.example.demo.cbs.service.BoardService;
import com.example.demo.cbs.service.BoardServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/campaign")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class BoardController {
    
    public final BoardServiceImpl service;

    @GetMapping("/list")
    public List<Board> boardList(){
        System.out.println("list불러오는 컨트롤러 진ㅇ입");
        return service.findAll();
    }
    @PostMapping("/create")
    public ResponseEntity<?> createCmp(@RequestBody Board board) throws Exception{
        System.out.println("create 컨트롤러 진입 ");
        service.createBoard(board);
        return new ResponseEntity<>(HttpStatus.OK);
    } 
    @GetMapping("/{cno}")
    public ResponseEntity<Board> readBoard(@PathVariable("cno") Long cno) {
        System.out.println("read 컨트롤러 진입");
        return new ResponseEntity<Board>(service.findBycno(cno),HttpStatus.OK);
    }
    
    
    
}
