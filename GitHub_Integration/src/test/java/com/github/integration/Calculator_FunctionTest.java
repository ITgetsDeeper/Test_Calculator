package com.github.integration;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Calculator_FunctionTest {
	
	// Check Arithmetic keys are Working
	public Calculator classUnderTest;  // Class name Calculator or any name (developer have to give)
	
	@Before
	 public void setUp() {
		this.classUnderTest = new Calculator();
	}
	@Test
	public void testAdd_positiveNumbers() {
		assertEquals("add",10, classUnderTest.add(3,7));
		
	}
	@Test
	public void test_Substract() {
		asserEquals("substract",2, classUnderTest.substract(5,3));
	}
	
	
	
	

}
