
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
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "no")
	private long no;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	@Column(name = "id")
	private String id;

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
	public User(String name,String id, String password, String age ,
	 String email, String birthday,String gender, String phone,Long no,LocalDateTime date){
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.no = no;
		this.date = date;
	}
}