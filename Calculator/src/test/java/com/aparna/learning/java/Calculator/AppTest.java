package com.aparna.learning.java.Calculator;

import com.aparna.learning.java.Calculator.BasicCalculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	BasicCalculator calculator;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    public void setUp() throws Exception {
      this.calculator = new BasicCalculator();
    }

    public void tearDown() throws Exception {
    	this.calculator = null;
    }


    /**
     * Rigourous Test :-)
     */
    public void testAddTwoPositiveNumbers(){
    	int c = calculator.add(4, 2);
    	assertTrue(c == 6);
    }
    
    public void testAddTwoNegativeNumbers(){
    	int c = calculator.add(-4, -2);
    	assertTrue(c == -6);
    }
    
    public void testAddPostiveAndNegativeNumber(){
    	int c = calculator.add(4, -2);
    	assertTrue(c == 2);
	}
    
    public void testAddPositiveAndZero(){
    	int c = calculator.add(4, 0);
    	assertTrue(c == 4);
    }
    
    public void testAddZeroAndPositiveNumber(){
    	int c = calculator.add(0, 4);
    	assertTrue(c == 4);
    }
    
    public void testSubTwoPosiiveNumbers1(){
    	int d= calculator.sub(4, 2);
    	assertTrue(d == 2);
    	
    }
    
    public void testSubTwoNegativeNumbers(){
    	int d = calculator.sub(-4, -2);
    	assertTrue(d == -2);
    }
    
    public void testSubPostiveAndNegativeNumbers(){
    	int d = calculator.sub(4, -2);
    	assertTrue(d == 6);
    }
    
    public void testSubNegativeAndzero(){
    	int d = calculator.sub(-4, 0);
    	assertTrue(d == -4);
    }
    
    public void testSubPositiveAndzero(){
    	int d = calculator.sub(4, 0);
    	assertTrue(d == 4);
    }
    
    public void testMulTwoPosiiveNumbers(){
    	int f= calculator.mul(4, 2);
    	assertTrue(f == 8);
    	
    }
    
    public void testMulTwoNegativeNumbers(){
    	int f = calculator.mul(-4, -2);
    	assertTrue(f == 8);
    }
    
    public void testMulPostiveAndNegativeNumbers(){
    	int f = calculator.mul(4, -2);
    	assertTrue(f == -8);
    }
    
    public void testMulNegativeAndZero(){
    	int f = calculator.mul(-4, 0);
    	assertTrue(f == 0);
    }
    
    public void testMulPositiveAndZero(){
    	int f = calculator.mul(4, 0);
    	assertTrue(f == 0);
    }
    public void testDivTwoPosiiveNumbers(){
    	try{
    		int g= calculator.div(4, 2);
    		assertTrue(g == 2);
    	}
    	catch(Exception e){
    		System.out.println("Exception: "+e);
    	}
    }
    
    public void testDivTwoNegativeNumbers(){
    	try{
    		int g= calculator.div(-4, -2);
    		assertTrue(g == 2);
    	}
    	catch(Exception e){
    		System.out.println("Exception: "+e);
    	}
    }
    
    public void testDivPostiveAndNegativeNumbers(){
    	try{
    		int g= calculator.div(4, -2);
    		assertTrue(g == -2);
    	}
    	catch(Exception e){
    		System.out.println("Exception: "+e);
    	}
    }
    
    public void testDivNegativeAndZeroNumbers(){
    	try{
    		int g= calculator.div(-4, 0);
    		fail();
    	}
    	catch(Exception e){
    		System.out.println("Exception: "+e);
    		assertEquals(e.getMessage(), "/ by zero");
    	}
    }
    
    public void testDivPositiveAndZeroNumbers(){
    	try{
    		int g= calculator.div(4, 0);
    		fail();
    	}
    	catch(Exception e){
    		System.out.println("Exception: "+e);
    		assertEquals(e.getMessage(), "/ by zero");
    	}
    }
}
