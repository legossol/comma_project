package com.example.demo.uss.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
public class UserDto implements Serializable{
    private static final long serialVersionUID = 1L;
	private long userno;
	private String name;
	private String username;
	private String password;
	private String email;
	private String age;
	private String birthday;
	private String gender;
	private String date;
	private String phone;
	
	
	public User toEntity(){
		return User.builder()
		.userno(userno)
		.name(name).age(age)
		.username(username).password(password).email(email).birthday(birthday)
		.gender(gender).phone(phone)
		.build();
	}
	
}

	