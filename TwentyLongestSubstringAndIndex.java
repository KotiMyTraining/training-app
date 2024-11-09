package com.internalEvolution;

public class TwentyLongestSubstringAndIndex {

	public static void main(String[] args) {
		
		String input="aabbbbcccdd";
		
		findLongestSubStringAndIndex(input);

	}

	private static void findLongestSubStringAndIndex(String input) {
		
		
		
		StringBuilder result=new StringBuilder();
		
		int length=input.length();
		
		int maxLength=0;
		int maxStartIndex=0;
		
		for(int i=0;i<length;i++)
		{
			int startIndex=i;
			int charLength=1;
			
			while(i<length-1&&input.charAt(i)==input.charAt(i+1))
			{
				i++;
				charLength++;
				
			}
			
			if(charLength>maxLength)
			{
				maxLength=charLength;
				maxStartIndex=startIndex;
			}
			
			
		}
		
		System.out.println("the max start index is " + maxStartIndex);
		System.out.println("the max length is "+ maxLength);
		System.out.println("the longest substring is " + input.substring(maxStartIndex, maxStartIndex+maxLength));
		
		
		
	}

}
