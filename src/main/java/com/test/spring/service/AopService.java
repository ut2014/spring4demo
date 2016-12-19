package com.test.spring.service;

import org.springframework.stereotype.Service;

@Service
public class AopService {
	//用户登入
	public void login() {
		System.out.println("登入成功");
	}
	//用户退出
	public void loginout() {
		System.out.println("用户退出系统");
	}
	//用户 操作
	public void writeAblog() {
		System.out.println("用户编写博客！");
	}
	//用户操作
	public void deleteAblog() {
		System.out.println("用户删除博客！");
		
	}
}
