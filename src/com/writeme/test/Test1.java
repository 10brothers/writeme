package com.writeme.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.writeme.system.utils.ServiceException;
import com.writeme.user.domain.UserAccount;
import com.writeme.user.service.UserServiceInterface;
import com.writeme.user.service.impl.UserServiceIntfImpl;

public class Test1 {
	
	@SuppressWarnings("unused")
	@Autowired
	private UserServiceInterface userService;
	
	
	public static void test(){
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserServiceIntfImpl userService =(UserServiceIntfImpl)ac.getBean("userService");
		try {
			UserAccount user = new UserAccount();
			user.setPassword("234343");
			userService.addUser(user);
			System.out.println(userService);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Test1.test();
	}
}
