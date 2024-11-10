package com.internalEvolution;

import java.math.BigInteger;
import java.util.AbstractMap.SimpleImmutableEntry;

public class SimplestFormFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num1=1, den1=500, num2=2, den2=1500; 
		    System.out.print(num1+"/"+den1+" + "+num2+"/"+den2+" is equal to ");
		    addFraction(num1, den1, num2, den2);

	}
	
	static int gcd(int a, int b)
	{
		
		return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
	}

	private static void addFraction(int num1, int den1, int num2, int den2) {
		
		
		int den3=gcd(den1,den2);
		den3=(den1*den2)/den3;
		
		int num3=num1*(den3/den1)+num2*(den3/den2);
		
	    int common_factor=gcd(num3,den3);
	    
	    int simplifiedNumerator=num3/common_factor;
	    int simplifiedDenominator=den3/common_factor;
	    
	    System.out.println(simplifiedNumerator+" /"+simplifiedDenominator);
		
	}

}
