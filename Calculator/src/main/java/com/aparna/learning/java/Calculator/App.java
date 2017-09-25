package com.aparna.learning.java.Calculator;

import com.aparna.learning.java.Calculator.BasicCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try{
	        BasicCalculator basicCalculator = new BasicCalculator();
	        double c = basicCalculator.add(4, 2);
	        System.out.println("add: "+c);
	        double d = basicCalculator.sub(4, 2);
	        System.out.println("sub: "+d);
	        double e = basicCalculator.mul(4, 2);
	        System.out.println("mul: "+e);
	        double f = basicCalculator.div(4, 2);
	        System.out.println("div: "+f);
	        
	        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
	    	double g= advancedCalculator.sqrt(4);
	    	System.out.println("sqrt: "+g);
	    	double h= advancedCalculator.power(4, 2);
	    	System.out.println("power: " +h);
	    	double i = advancedCalculator.add(3, 2);
	    	System.out.println("add: "+i);
	    	
	    	FunnyBasicCalculator myCalculator = new FunnyBasicCalculator();
	    	double j = myCalculator.mul(4, 7);
	    	System.out.println("mul: "+j);
	    	
	    	j = basicCalculator.mul(4, 7);
	    	System.out.println("mul: "+j);
	    	
	    	System.out.println("The End");
    	}
    	catch(Exception e){
    		System.out.println("Exception: "+e);
    	}
    }
}
