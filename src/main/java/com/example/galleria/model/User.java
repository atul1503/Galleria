package com.example.galleria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name="users")
public class User {
	
	@Id
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private int age;
	
	
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	public int getAge() {
		return this.age;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setAge(int age) {
		this.age=age;
	}
	

}
