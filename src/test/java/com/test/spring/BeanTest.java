package com.test.spring;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.interfaces.PBEKey;
import javax.swing.JPanel;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class BeanTest {
	private ApplicationContext context;
	private JdbcTemplate jdbcTemplate;
	{
		context=new ClassPathXmlApplicationContext("beans.xml");
		jdbcTemplate=(JdbcTemplate) context.getBean("jdbcTemplate");
	}
	
	@Test
	public void saveUser(){
		String sqlString="insert into user(userName,userAge) value(?,?);";
		jdbcTemplate.update(sqlString,"ussns","26");
	}
	@Test
	public void updateUser(){
		String sqlString="update user set userName = ? , userAge = ? where id = ?";
		jdbcTemplate.update(sqlString,"itesm","36",6);
	}
	@Test
	public void deleteUser(){
		String sqlString="delete from user where id=?";
		jdbcTemplate.update(sqlString,2);
	}
	@Test
	public void saveUsers(){
		String sqlString="insert into user(userName,userAge) values(?,?)";
		List<Object[]> usersList=new ArrayList<>();
		
		usersList.add(new Object[]{"it01","25"});
		usersList.add(new Object[]{"it02","24"});
		usersList.add(new Object[]{"it03","22"});
		usersList.add(new Object[]{"it04","21"});
		jdbcTemplate.batchUpdate(sqlString,usersList);
	}
	
	@Test
	public void updateUsers(){
		String sqlString="update user set userName=?,userAge=? where id=?";
		List<Object[]> usersList=new ArrayList<>();
		usersList.add(new Object[]{"it01","21",7});
		usersList.add(new Object[]{"it02","22",8});
		usersList.add(new Object[]{"it03","23",9});
		usersList.add(new Object[]{"it04","24",10});
		jdbcTemplate.batchUpdate(sqlString,usersList);
	}
}
