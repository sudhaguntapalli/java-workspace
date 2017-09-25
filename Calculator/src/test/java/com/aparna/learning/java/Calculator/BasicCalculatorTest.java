package com.aparna.learning.java.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator calculator;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.calculator = new BasicCalculator();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAddTwoPositiveNumbers(){
    	BasicCalculator cal = new BasicCalculator();
    	cal.add(2, 1);
    	double c = calculator.add(4, 2);
    	assertTrue(c == 6);
    }
    
	@Test
    public void testAddTwoNegativeNumbers(){
    	BasicCalculator cal = new BasicCalculator();
    	cal.add(-2, -1);
    	double c = calculator.add(-4, -2);
    	assertTrue(c == -6);
    }
    
    @Test
    public void testAddPostiveAndNegativeNumber(){
    	double c = calculator.add(4, -2);
    	assertTrue(c == 2);
	}
    
    @Test
    public void testAddPositiveAndZero(){
    	double c = calculator.add(4, 0);
    	assertTrue(c == 4);
    }
    
    @Test
    public void testAddZeroAndPositiveNumber(){
    	double c = calculator.add(0, 4);
    	assertTrue(c == 4);
    }
    
    @Test
    public void testSubTwoPosiiveNumbers1(){
    	double d= calculator.sub(4, 2);
    	assertTrue(d == 2);
    	
    }
    
    @Test
    public void testSubTwoNegativeNumbers(){
    	double d = calculator.sub(-4, -2);
    	assertTrue(d == -2);
    }
    
    @Test
    public void testSubPostiveAndNegativeNumbers(){
    	double d = calculator.sub(4, -2);
    	assertTrue(d == 6);
    }
    
    @Test
    public void testSubNegativeAndzero(){
    	double d = calculator.sub(-4, 0);
    	assertTrue(d == -4);
    }
    
    @Test
    public void testSubPositiveAndzero(){
    	double d = calculator.sub(4, 0);
    	assertTrue(d == 4);
    }
    
    @Test
    public void testMulTwoPosiiveNumbers(){
    	double f= calculator.mul(4, 2);
    	assertTrue(f == 8);
    	
    }
    
    @Test
    public void testMulTwoNegativeNumbers(){
    	double f = calculator.mul(-4, -2);
    	assertTrue(f == 8);
    }
    
    @Test
    public void testMulPostiveAndNegativeNumbers(){
    	double f = calculator.mul(4, -2);
    	assertTrue(f == -8);
    }
    
    @Test
    public void testMulNegativeAndZero(){
    	double f = calculator.mul(-4, 0);
    	assertTrue(f == 0);
    }
    
    @Test
    public void testMulPositiveAndZero(){
    	double f = calculator.mul(4, 0);
    	assertTrue(f == 0);
    }
    
    @Test
    public void testDivTwoPosiiveNumbers(){
    	try{
    		double g= calculator.div(4, 2);
    		assertTrue(g == 2);
    	}
    	catch(Exception e){
    		System.out.println("Exception: "+e);
    	}
    }
    
    @Test
    public void testDivTwoNegativeNumbers(){
    	try{
    		double g= calculator.div(-4, -2);
    		assertTrue(g == 2);
    	}
    	catch(Exception e){
    		System.out.println("Exception: "+e);
    	}
    }
    
    @Test
    public void testDivPostiveAndNegativeNumbers(){
    	try{
    		double g= calculator.div(4, -2);
    		assertTrue(g == -2);
    	}
    	catch(Exception e){
    		System.out.println("Exception: "+e);
    	}
    }
    
    @Test
    public void testDivNegativeAndZeroNumbers(){
    	try{
    		calculator.div(-4, 0);
    		fail();
    	}
    	catch(Exception e){
    		System.out.println("Exception: "+e);
    		assertEquals(e.getMessage(), "/ by zero");
    	}
    }
    
    @Test
    public void testDivPositiveAndZeroNumbers(){
    	try{
    		calculator.div(4, 0);
    		fail();
    	}
    	catch(Exception e){
    		System.out.println("Exception: "+e);
    		assertEquals(e.getMessage(), "/ by zero");
    	}
    }

}
