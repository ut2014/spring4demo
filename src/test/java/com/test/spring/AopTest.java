package com.test.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.spring.service.AopService;

public class AopTest {
	private ApplicationContext context;
	{
		context=new ClassPathXmlApplicationContext("beans.xml");
		
	}
	@Test
	public void aopTest(){
		AopService aService=context.getBean(AopService.class);
		aService.login();
		aService.writeAblog();
		aService.deleteAblog();
		aService.loginout();
	}
}
