package com.internalEvolution;

import java.util.HashMap;

public class NineteenNumenatorDenominator {

	public static void main(String[] args) {


		int num = 113;
		int den = 56;

		String resString1 = calculateFraction(num, den);
		
		num = -1;
		den = 2;

		String resString2 = calculateFraction(num, den);
		
		System.out.println(resString1);
		System.out.println(resString2);
		
	}

	private static String calculateFraction(int num, int den) {
		
		
		 if(num==0) return "0";
		 if(den==0) return "";
		 
		 StringBuilder result=new StringBuilder();
		 
		if(num<0 ^ den<0)
		{
			result.append("-");
			
		}
		
		num=Math.abs(num);
		den=Math.abs(den);
		
		long quo=num/den;
		long rem=num%den*10;
		
		result.append(String.valueOf(quo));
		
		if(rem==0)
		{
			return result.toString();
		}
		
		result.append(".");
		HashMap<Long,Integer> map=new HashMap();
		while(rem!=0)
		{
			
			if(map.containsKey(rem))
			{
				int index=map.get(rem);
				
				String part1=result.substring(0,index);
				
				String part2="(" + result.substring(index,result.length())+")";
				
				return part1+part2;
				
			}
			
			map.put(rem,result.length());
			
			quo=rem/den;
			
			result.append(String.valueOf(quo));
			
			rem= (rem%den)*10;
			
			
		}
		
		
		
		return result.toString();
	}

}
 