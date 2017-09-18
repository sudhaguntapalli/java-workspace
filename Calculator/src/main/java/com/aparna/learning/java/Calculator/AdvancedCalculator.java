package com.aparna.learning.java.Calculator;

public class AdvancedCalculator extends BasicCalculator implements AdvancedCalculatorInterface {
	
	public AdvancedCalculator(){
		
	}
	
	public double sqrt(int a) {
		return Math.sqrt(a);
	}

	public double power(double a, double b) {
		return Math.pow(a, b);
	}

}
