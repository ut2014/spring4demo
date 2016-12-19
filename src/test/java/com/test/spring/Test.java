package com.test.spring;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.MySQLConnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private ApplicationContext context;
	{
		context=new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@org.junit.Test
	public void UserTest(){
		User user=(User)context.getBean("user");
		System.out.println(user.toString());
	}
	
	@org.junit.Test
	public void MainTest(){
		Main main=context.getBean(Main.class);
		main.hello();
	}
	@org.junit.Test
	public void ListUser() {
		Company companys=context.getBean(Company.class);
		System.out.println(companys.toString());
	}
	
	@org.junit.Test
	public void C3p0Connection() throws SQLException{
		DataSource dataSource=(DataSource)context.getBean("dataSource");
		System.out.println(dataSource);
	}
	
	@org.junit.Test
	public void parentTest(){
		User parentUser=(User)context.getBean("userparent");
		System.out.println(parentUser.toString());
	}
}
