package com.example.demo.cbs.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Getter
@Table(name="campaign")
@NoArgsConstructor
public class Board {

    @Id
    @Column(name = "cno")
    private Long cno;
    @Column(name = "title")
    private String title;
    @Column(name = "writer")
    private String writer;
    @Column(name = "content")
    private String content;
    
    
    @Builder
    public Board(Long cno, String title, String writer, String conetent){
        this.cno = cno;
        this.title = title;
        this.writer = title;
        this.content = content;
    }
}
