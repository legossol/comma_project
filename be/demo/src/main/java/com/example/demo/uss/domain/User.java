
package com.example.demo.uss.domain;

import java.time.LocalDateTime;

import javax.persistence.*;

import com.amazonaws.services.alexaforbusiness.model.UserData;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "members")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "userno")
	private long userno;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	@Column(name = "username")
	private String username;
	
	@Column(name = "age")
	private String age;

	@Column(name = "email")
	private String email;
	
	@Column(name = "birthday")
	private String birthday;
	
	@Column(name = "gender")
	private String gender;
	
	@CreationTimestamp
	@Column(name = "date")
	private LocalDateTime date;

    @Column(name = "phone")
	private String phone;
	
	@Builder
	public User(String name,String username, String password, String age ,
	 String email, String birthday,String gender, String phone,Long userno,LocalDateTime date){
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.userno = userno;
		this.date = date;
	}

}