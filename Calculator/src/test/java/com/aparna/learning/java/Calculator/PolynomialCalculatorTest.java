package com.aparna.learning.java.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.eq;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class PolynomialCalculatorTest {
	@Mock AdvancedCalculator advancedCalculator;
	PolynomialCalculator polymonialCalculator = new PolynomialCalculator();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		polymonialCalculator.setAdvancedCalculator(advancedCalculator);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSecondDegreePolymonial() {
		//Setup
		// y = 10X^2 + 5X + 2
		double a = 10;
		double b = 5;
		double c = 2;
		double x = 3.0;
		
		//Stub
		Mockito.when(advancedCalculator.power(x, 2)).thenReturn(9.0);
		Mockito.when(advancedCalculator.mul(a, 9.0)).thenReturn(90.0);
		Mockito.when(advancedCalculator.mul(b, x)).thenReturn(15.0);
		Mockito.when(advancedCalculator.add(90.0, 15.0)).thenReturn(105.0);
		Mockito.when(advancedCalculator.add(105.0, c)).thenReturn(107.0);
		
		//Execution
		double result = polymonialCalculator.secondDegreePolynomial(x, a, b, c);
		
		//Verification
		assertNotNull(polymonialCalculator);
		assertNotNull(advancedCalculator);
		
		assertEquals(107.0, result, 0.0f);
		
		Mockito.verify(advancedCalculator, Mockito.times(1)).power(eq(x), eq(2d));
		Mockito.verify(advancedCalculator, Mockito.times(1)).mul(eq(a), eq(9d));
		Mockito.verify(advancedCalculator, Mockito.times(1)).mul(eq(b), eq(x));
		Mockito.verify(advancedCalculator, Mockito.times(1)).add(eq(90d), eq(15d));
		Mockito.verify(advancedCalculator, Mockito.times(1)).add(eq(105d), eq(c));
		
	}

}