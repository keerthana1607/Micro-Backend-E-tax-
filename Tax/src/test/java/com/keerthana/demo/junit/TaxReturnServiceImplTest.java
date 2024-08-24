package com.keerthana.demo.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.keerthana.demo.serviceimpl.TaxReturnServiceImpl;

@SpringBootTest
class TaxReturnServiceImplTest {
	
	
@Autowired
TaxReturnServiceImpl taxreturntest;

	@Test
	void testApprovedforms() {
		assertNotNull(taxreturntest.getApprovedforms());
	}
	
	@Test
	void testRejectedforms() {
		assertNotNull(taxreturntest.getRejectedforms());
	}
	
	@Test
	void testPaymentforms() {
		assertNotNull(taxreturntest.getPaymentforms());
	}
	
	@Test
	void testPendingforms() {
		assertNotNull(taxreturntest.getPendingforms());
	}

}
