package com.test.spring;

public class Main {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	public void hello(){
		System.out.println(user.toString());
	}
}
