package com.example.demo.uss.domain;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
public class UserDto implements Serializable{
    private static final long serialVersionUID = 1L;
	private long userNo;
	private String name;
	private String username;
	private String password;
	private String email;
	private String age;
	private String birthday;
	private String gender;
	private String regdate;
	private String phoneNumber;
	
	
	public User toEntity(){
		return User.builder()
		.name(name).age(age)
		.userName(username).password(password).email(email).birthday(birthday)
		.gender(gender).regdate(regdate).phoneNumber(phoneNumber)
		.build();
	}
}

	