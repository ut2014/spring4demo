package com.test.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.spring.repository.UserRepository;

public class AnnotationTest {
	private ApplicationContext context;
	{
		context=new ClassPathXmlApplicationContext("beans.xml");
	}
	@Test
	public void testAnnotation(){
		UserRepository uRepository=context.getBean(UserRepository.class);
		uRepository.findUser();
	}
}
