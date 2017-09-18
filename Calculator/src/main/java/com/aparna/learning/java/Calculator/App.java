package com.aparna.learning.java.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BasicCalculator calculator = new BasicCalculator();
    	int c = calculator.add(3, 2);
    	System.out.println("add: "+c);
    	int d = calculator.sub(3, 2);
    	System.out.println("sub: "+d);
    	int e = calculator.mul(3, 2);
    	System.out.println("mul: "+e);  	
    	int f = calculator.div(3, 2);
    	System.out.println("div: "+f);
    	
    	AdvancedCalculator advancedCalculator = new AdvancedCalculator();
    	double g= advancedCalculator.sqrt(4);
    	System.out.println("sqrt: "+g);
    	double h= advancedCalculator.power(4, 2);
    	System.out.println("power: " +h);
    	int i = advancedCalculator.add(3, 2);
    	System.out.println("add: "+i);
    	
    	FunnyBasicCalculator myCalculator = new FunnyBasicCalculator();
    	int j = myCalculator.mul(4, 7);
    	System.out.println("mul: "+j);
    	
    	j = calculator.mul(4, 7);
    	System.out.println("mul: "+j);
    	
    	System.out.println("The End");
    	
    }
}
