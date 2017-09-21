package com.aparna.learning.java.Calculator;

import junit.framework.TestCase;

public class AdvancedCalculatorTest extends TestCase {
	
	public AdvancedCalculatorTest(String testName) {
		super(testName);
	}

	AdvancedCalculator calculator;
	
	public void setUp() throws Exception {
		super.setUp();
		calculator = new AdvancedCalculator();
	}

	public void tearDown() throws Exception {
		super.tearDown();
		calculator = null;
	}
	
	public void testSqrtPositiveNumber(){
		double h = calculator.sqrt(4);
		System.out.println(h);
		assertTrue(h == 2);
	} 
	
	public void testSqrtNegativeNumber(){
		double h = calculator.sqrt(-4);
		System.out.print(h);
		assertTrue(Double.valueOf(h).equals(Double.NaN));
	}
	
	public void testZeroNumber(){
		double h = calculator.sqrt(0);
		assertTrue(h == 0);
	}
	
	public void testPowerTwoPositiveNumbers(){
		double i = calculator.power(2, 4);
		assertTrue(i == 16);
		}
		
	public void testPowerTwoNegativeNumbers(){
		double i = calculator.power(-2, -4);
		assertTrue(i == 0.0625);
	}
	
	public void testPowerPostitiveAndNegativeNumber(){
		double i = calculator.power(2, -4);
		assertTrue(i == 0.0625);
	}
	
	public void testPowerNegativeAndPositiveNumber(){
		double i = calculator.power(-4, 2);
		assertTrue(i == 16);
	}
	

}
