package com.example.demo.cbs.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BoardDto implements Serializable{
    private static final long serialVersionUID = 1L;
    private long cno;
    private String desCity;
    private String desGu;
    private String date;
    private String purpose;

    
}
