package com.test.spring;

import java.util.List;

public class Company {

	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Company [users=" + users + "]";
	}
	
	
}
