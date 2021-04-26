package com.example.demo.cbs.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name="campaign")
public class Board {

    @Id
    @GeneratedValue
    @Column(name = "cno")
    private Long cno;
    @Column(name = "des_city")
    private String desCity;
    @Column(name = "des_gu")
    private String desGu;
    @Column(name = "date")
    private String date;
    @Column(name = "purpose")
    private String purpose;
    
    
    @Builder
    public Board(Long cno, String desCity, String desGu, String date, String purpose){
        this.cno = cno;
        this.desCity = desCity;
        this.desGu = desGu;
        this.date = date;
        this.purpose = purpose;
    }
}
