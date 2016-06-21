package com.spring.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
	@Test
	public  void userServiceTest(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		UserService us = (UserService)ac.getBean("userService");
		us.addUser();
	}
}
