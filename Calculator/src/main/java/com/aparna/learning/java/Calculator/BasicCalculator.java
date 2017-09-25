package com.aparna.learning.java.Calculator;

import com.aparna.learning.java.Calculator.CalculatorInterface;

public class BasicCalculator implements CalculatorInterface {
	
	public BasicCalculator(){
		
	}

	public double add(double a, double b) {
		double c = 0;
		try{
			c =  a + b;
		}
		catch(Exception e){
			System.out.println("Exception: "+ e);
		}
		return c;
	}

	public double sub(double a, double b) {
		double d = 0;
		try{
			d = a - b;
		}
		catch(Exception e){
			System.out.println("Exception:" +e);
		}
		return d;
	}	
	

	public double mul(double a, double b) {
		double f = 0;
		try{
			f = a * b;
		}
		catch(Exception e){
			System.out.println("Exception:" +e);
		}
		return f;
	}

	public double div(double a, double b) throws Exception {
		double g = 0;
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
