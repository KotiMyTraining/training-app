package com.coderpadtest;

import java.util.Arrays;

public class ArrayWaveForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    int[] input = {10, 5, 6, 3, 2, 20, 100, 80};
	    
	    convertArrayIntoWaveForm(input);
	    
	    
	   

	}

	private static void convertArrayIntoWaveForm(int[] input) {
		
		
		  int left=0;
		  int right=input.length-1;
		  
		  int temp=0;
		  
		  while(left<right)
			  
		  {
			  if(input[left]<input[left+1])
			  {
				  temp=input[left];
				  input[left]=input[left+1];
				  input[left+1]=temp;
				  
			  }
			  left=left+2;
			  }
		
		
		System.out.println(Arrays.toString(input));
	}

}
