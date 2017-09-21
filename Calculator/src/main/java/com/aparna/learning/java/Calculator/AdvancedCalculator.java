package com.aparna.learning.java.Calculator;

public class AdvancedCalculator extends BasicCalculator implements AdvancedCalculatorInterface {
	
	public AdvancedCalculator(){
		
	}
	
	public double sqrt(int a) {
		double x = 0;
		try{
			x =  Math.sqrt(a);
		}
		catch(Exception e){
			System.out.print("Exception: "+e);
		}
		return x;
	}

	public double power(double a, double b) {
		double x = 0;
		try{
			x =  Math.pow(a, b);
		}
		catch(Exception e){
			System.out.print("Exception: "+e);
		}
		return x;
	}

	
	
	
}
