package com.practiceafterten;

import java.util.HashSet;

public class longSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="abcabcdab";
		
		String result=findMaxLengthSubString(input);
		
		System.out.println("longest substring is "+ result);

	}

	private static String findMaxLengthSubString(String input) {
		// TODO Auto-generated method stub
		
		int left=0;
		int right=0;
		
		int maxLength=0;
		int startOfLongest=0;
		
		 HashSet<Character> set=new HashSet<Character>();
		 
		 for(right=0;right<input.length();right++)
		 {
			 
		    while(set.contains(input.charAt(right)))
		    {
		    	set.remove(input.charAt(left));
		    	left++;
		    	
		    }
			set.add(input.charAt(right));
			
			if(right-left+1>maxLength)
			{
				maxLength=right-left+1;
				startOfLongest=left;
			}
			
		 }
		
		return input.substring(startOfLongest,startOfLongest+maxLength);
	}

}
