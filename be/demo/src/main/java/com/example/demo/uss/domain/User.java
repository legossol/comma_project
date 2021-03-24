
package com.example.demo.uss.domain;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_no")
	private long userNo;

	@Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
	private String lastName;

	@Column(name = "password")
	private String password;

	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;
	
	@Column(name = "birthday")
	private String birthday;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "regdate")
    private String regdate;

    @Column(name = "phone_number")
    private String phoneNumber;

    public User(String firstName, String lastName, String birthday, String email,String gender,String phoneNumber){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.gender = gender;
        this.regdate = regdate;
        this.phoneNumber = phoneNumber
    }

   

}