package com.internalEvolution;

public class EighteenMissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    int[] arr1 = {1, 2, 3, 4};    // Return 0

	    int[] arr2 = {0, 1, 3, 4};    // Return 2"
	    
	    findMissingInteger(arr2);
	    

	}

	private static void findMissingInteger(int[] arr1) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			sum=sum+arr1[i];
		}
		
		int expectedSum=arr1.length*(arr1.length+1)/2;
		
		System.out.println(expectedSum-sum);
	
	}

}
