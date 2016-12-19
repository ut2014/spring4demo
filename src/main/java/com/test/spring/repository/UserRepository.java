package com.test.spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	public void findUser(){
		System.out.println("这是通过注解来配置bean");
	}
}
