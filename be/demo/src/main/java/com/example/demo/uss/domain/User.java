
package com.example.demo.uss.domain;

import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Table(name = "users")
@AllArgsConstructor 
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_no")
	private long userNo;

	@Column(name = "name")
	private String name;

	@Column(name = "password", length = 64)
	private String password;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "age")
	private String age;

	@Column(name = "email", unique = true, length = 45)
	private String email;
	
	@Column(name = "birthday")
	private String birthday;
	
	@Column(name = "gender")
	private String gender;
	
	@CreationTimestamp
	@Column(name = "reg_date", nullable = false, updatable = false)
	private LocalDateTime regDate;

    @Column(name = "phone")
    private String phone;

	@Builder
    public User(String name,String userName, String password, String age ,String birthday, String email,String gender, String phone){
		super();
        this.name = name;
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
		this.email = email;
		this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

   

}