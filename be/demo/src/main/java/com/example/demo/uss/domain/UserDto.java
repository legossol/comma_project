package com.example.demo.uss.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Data;

@Component
@Data
public class UserDto implements Serializable{
    private static final long serialVersionUID = 1L;
	private long userNo;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private String birthday;
	private String gender;
	private String regdate;
	private String phoneNumber;
	
}

	