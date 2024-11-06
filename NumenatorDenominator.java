package com.coderpadtest;

//of two numbers
import java.util.*;

class NumenatorDenominator {

	public static String calculateFraction(int num, int den)
	{
		if (num == 0)
			return "0"; // if numerator is zero
		if (den == 0)
			return ""; // if denominator is zero

		// result StringBuilder

		StringBuilder result = new StringBuilder();
		if ((num < 0) ^ (den < 0))
			result.append("-"); 
		

		num = Math.abs(num);
		den = Math.abs(den);

		long quo = num / den; 
		long rem = num % den * 10; 
		result.append(
			String.valueOf(quo)); // appending quotient
		if (rem == 0)
			return result
				.toString(); // return if remainder is 0


		result.append(".");
		Map<Long, Integer> m
			= new HashMap<>(); 

		while (rem != 0) {

			if (m.containsKey(rem)) {

				

				int index = m.get(rem);
				String part1 = result.substring(0, index);
				String part2 = "("
							+ result.substring(
								index, result.length())
							+ ")";
				return part1 + part2;
			}

			

			m.put(rem, result.length());
			quo = rem / den;
			result.append(String.valueOf(quo));

			// update rem
			rem = (rem % den) * 10;
		}
		return result.toString();
	}

	// Driver code
	public static void main(String[] args)
	{/*
		 * int num = 113; int den = 56;
		 * 
		 * String resString1 = calculateFraction(num, den);
		 */

	int 	num = -1;
	int 	den = 2;

		String resString2 = calculateFraction(num, den);

		//System.out.println(resString1);
		System.out.println(resString2);
	}
}


