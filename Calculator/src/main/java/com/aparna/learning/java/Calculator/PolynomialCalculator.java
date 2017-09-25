package com.aparna.learning.java.Calculator;

public class PolynomialCalculator implements PolynomialCalculatorInterface {
	AdvancedCalculator advancedCalculator;
	
	public PolynomialCalculator() {
		super();
	}

	public PolynomialCalculator(AdvancedCalculator advancedCalculator) {
		super();
		this.advancedCalculator = advancedCalculator;
	}

	public AdvancedCalculator getAdvancedCalculator() {
		return advancedCalculator;
	}

	public void setAdvancedCalculator(AdvancedCalculator advancedCalculator) {
		this.advancedCalculator = advancedCalculator;
	}

	@Override
	//y=ax^2 + bx + c
	public double secondDegreePolynomial(double x, double a, double b, double c) {
		
		double xSquare = advancedCalculator.power(x, 2.0);
		System.out.println("Called power xSquare: "+ xSquare);
		
		double aXSquare = advancedCalculator.mul(a, xSquare);
		System.out.println("Called mul aXSquare: "+ aXSquare);
		
		double bX = advancedCalculator.mul(b,x);
		System.out.println("Called mul bX: "+ bX);
		
		double aXSquarePlusBX = advancedCalculator.add(aXSquare, bX);
		System.out.println("Called add aXSquarePlusBX: "+ aXSquarePlusBX);
		
		double aXSquarePlusBXPlusC = advancedCalculator.add(aXSquarePlusBX, c);
		System.out.println("Called add aXSquarePlusBXPlusC: "+ aXSquarePlusBXPlusC);
		return aXSquarePlusBXPlusC;
	}

}