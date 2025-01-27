package com.internalEvolution;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		
		
		String input2 = "";
		
		int start=0;
		int maxStart=0;
		int maxLength=0;
		
		HashSet<Character> set=new HashSet();
		
		for(int end=0;end<input2.length();end++)
		{
			
			while(set.contains(input2.charAt(end)))
			{
				set.remove(input2.charAt(end));
				start++;
				
			}
			set.add(input2.charAt(end));
			
			if(end-start+1>maxLength)
			{
			    maxLength=end-start+1;
			    maxStart=start;
			}
			
		}
		
		System.out.println(" the longest substring is "+input2.substring(maxStart,maxStart+maxLength));

	}

}
