package com.aparna.learning.java.Calculator;

public class BasicCalculator implements CalculatorInterface {
	
	public BasicCalculator(){
		
	}
	
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

}
