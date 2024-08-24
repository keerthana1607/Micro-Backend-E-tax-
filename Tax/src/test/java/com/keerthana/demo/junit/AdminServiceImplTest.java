
package com.keerthana.demo.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.keerthana.demo.serviceimpl.AdminServiceImpl;
import com.keerthana.demo.model.Admin;


@SpringBootTest
class AdminServiceImplTest {

	@Autowired
	private AdminServiceImpl admintest;
	
	@Test
	void testAddadmin() {
		Admin ad =new Admin(0,"Kannan","123","0987654","k@gmail.com");
		assertEquals("success",admintest.newAdmin(ad));
	}
	
	@Test
	void testAddadmin1() {
		Admin ad =null;
		assertEquals("failed to add",admintest.newAdmin(ad));
	}

	

	@Test
	void testGetAllAdmin() {
		assertNotNull(admintest.getAdmins());
	}



}
