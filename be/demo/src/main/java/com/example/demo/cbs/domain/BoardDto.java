package com.example.demo.cbs.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BoardDto implements Serializable{
    private static final long serialVersionUID = 1L;
    private long cmpNo;
    private String writer;
    private String title;
    private String content;

    
}
