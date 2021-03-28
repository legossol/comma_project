package com.example.demo.uss.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
public class UserDto implements Serializable{
    private static final long serialVersionUID = 1L;
	private long userNo;
	private String name;
	private String userName;
	private String password;
	private String email;
	private String age;
	private String birthday;
	private String gender;
	private String regdate;
	private String phone;
	
	
	public User toEntity(){
		return User.builder()
		.name(name).age(age)
		.userName(userName).password(password).email(email).birthday(birthday)
		.gender(gender).phone(phone)
		.build();
	}
}

	