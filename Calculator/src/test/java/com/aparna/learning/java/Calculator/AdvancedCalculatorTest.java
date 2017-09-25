package com.aparna.learning.java.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator calculator;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calculator = new AdvancedCalculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSqrtPositiveNumber(){
		double h = calculator.sqrt(4);
		System.out.println(h);
		assertTrue(h == 2);
	} 
	
	@Test
	public void testSqrtNegativeNumber(){
		double h = calculator.sqrt(-4);
		System.out.print(h);
		assertTrue(Double.valueOf(h).equals(Double.NaN));
	}
	
	@Test
	public void testZeroNumber(){
		double h = calculator.sqrt(0);
		assertTrue(h == 0);
	}
	
	@Test
	public void testPowerTwoPositiveNumbers(){
		double i = calculator.power(2, 4);
		assertTrue(i == 16);
		}
		
	@Test
	public void testPowerTwoNegativeNumbers(){
		double i = calculator.power(-2, -4);
		assertTrue(i == 0.0625);
	}
	
	@Test
	public void testPowerPostitiveAndNegativeNumber(){
		double i = calculator.power(2, -4);
		assertTrue(i == 0.0625);
	}
	
	@Test
	public void testPowerNegativeAndPositiveNumber(){
		double i = calculator.power(-4, 2);
		assertTrue(i == 16);
	}

}
