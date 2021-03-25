
package com.example.demo.uss.domain;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_no")
	private long userNo;

	@Column(name = "name")
	private String name;

	@Column(name = "password", nullable = false, length = 64)
	private String password;

	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "age")
	private String age;

	@Column(name = "email", nullable = false, unique = true, length = 45)
	private String email;
	
	@Column(name = "birthday")
	private String birthday;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "regdate")
    private String regdate;

    @Column(name = "phone_number")
    private String phoneNumber;

	@Builder
    public User(String name,String userName, String password, String age ,String birthday, String email,String gender, String regdate,String phoneNumber){
		super();
        this.name = name;
		this.username = userName;
		this.password = password;
		this.birthday = birthday;
		this.email = email;
		this.age = age;
        this.gender = gender;
        this.regdate = regdate;
        this.phoneNumber = phoneNumber;
    }

   

}