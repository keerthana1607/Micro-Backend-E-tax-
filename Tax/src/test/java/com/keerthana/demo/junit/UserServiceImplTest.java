package com.keerthana.demo.JUnit;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.keerthana.demo.model.User;
import com.keerthana.demo.serviceimpl.UserServiceImpl;

@SpringBootTest
class UserServiceImplTest {
	
	@Autowired
	UserServiceImpl usertest;

	@Test
	void testinsertUser() {
		User ad =new User(0,"Kannan","123","0987654","k@gmail.com","anna nagar");
		assertEquals("success",usertest.insertUser(ad));
	}
	
	@Test
	void testAddUser1() {
		User ad =null;
		assertEquals("failed to add",usertest.insertUser(ad));
	}

	

	@Test
	void testGetAllUser() {
		assertNotNull(usertest.getUsers());
	}

}
