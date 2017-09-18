package com.aparna.learning.java.Calculator;

public class FunnyBasicCalculator extends BasicCalculator implements CalculatorInterface{
	public FunnyBasicCalculator(){
		
	}
		
	public int add (int a, int b){
		return a+b;
	
	}
	public int sub (int a, int b){
		return a-b;
	}
	public int mul(int a, int b){
		int x = a;
	for(int i=1;i<b;i++){
		x = add(a,x);
	}
	return x;
	}
}
