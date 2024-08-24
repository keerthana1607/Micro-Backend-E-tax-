package com.keerthana.demo.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.keerthana.demo.serviceimpl.TaxPolicyServiceImpl;

@SpringBootTest
class TaxPolicyServiceImplTest {
	
	@Autowired
	TaxPolicyServiceImpl taxpolicytest;

	@Test
	void testgetAllPoliciesType() {
		assertNotNull(taxpolicytest.getAllPoliciesType());
	}
	
	@Test
	void testgetAllPoliciesDetails() {
		assertNotNull(taxpolicytest.getAllPoliciesDetails());
	}

}
