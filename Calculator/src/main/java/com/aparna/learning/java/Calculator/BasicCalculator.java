package com.aparna.learning.java.Calculator;

import com.aparna.learning.java.Calculator.CalculatorInterface;

public class BasicCalculator implements CalculatorInterface {
	
	public BasicCalculator(){
		
	}

	public int add(int a, int b) {
		int c = 0;
		try{
			c =  a + b;
		}
		catch(Exception e){
			System.out.println("Exception: "+ e);
		}
		return c;
	}

	public int sub(int a, int b) {
		int d = 0;
		try{
			d = a - b;
		}
		catch(Exception e){
			System.out.println("Exception:" +e);
		}
		return d;
	}	
	

	public int mul(int a, int b) {
		int f = 0;
		try{
			f = a * b;
		}
		catch(Exception e){
			System.out.println("Exception:" +e);
		}
		return f;
	}

	public int div(int a, int b) throws Exception {
		int g = 0;
		try{
			g = a / b;
		}
		catch(Exception e){
			System.out.println("Exception:" +e);
			throw e;
		}
		return g;
	}
}
