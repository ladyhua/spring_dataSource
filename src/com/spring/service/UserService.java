package com.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.spring.persistence.UserPersistence;
@Component("userService")
public class UserService {
	private UserPersistence up;
	
	public void addUser(){
		up.addUser();
	}
	
	public UserPersistence getUp() {
		return up;
	}
	@Resource(name="userPersistence")
	public void setUp(UserPersistence up) {
		this.up = up;
	}
	
}
