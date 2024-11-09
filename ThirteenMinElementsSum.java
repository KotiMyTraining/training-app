package com.internalEvolution;

import java.util.Arrays;

public class ThirteenMinElementsSum {

	public static void main(String[] args) {
		
		int[] input= {2,4,6,10,2,1};
		int k=12;
		
		int length =findMinElementsSum(input,k);

	}

	private static int findMinElementsSum(int[] input,int target) {
		// TODO Auto-generated method stub
		
		int minLength=Integer.MAX_VALUE;
		int minStart=0;
		int minEnd=0;
		int left=0;
		int currentSum=0;
		
		for(int right=0;right<input.length;right++)
		{
		   currentSum+=input[right];
		   
		   while(currentSum>=target)
		   {
			   
			   if(right-left+1<=minLength)
			   {
				   minLength=right-left+1;
				   minStart=left;
				   minEnd=right;
			   }
			   currentSum-=input[left];
			   left++;
			   
		   }
			
		}
		
		System.out.println(minLength);
		System.out.println(Arrays.toString(Arrays.copyOfRange(input, minStart, minEnd+1)));
		return minLength;
	}

}
