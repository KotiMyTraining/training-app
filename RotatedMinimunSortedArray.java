package com.internalEvolution;

public class RotatedMinimunSortedArray {

	public static void main(String[] args) {
		
		
		 int[] arr1 = {5, 6, 1, 2, 3, 4};
		    int[] arr2 = {1, 2, 3, 4};
		    int[] arr3 = {2, 2, 2, 0, 1};
		    int[] arr4 = {10, 1, 10, 10, 10};
	  
	   int min=findMinInRotatedSortedArray(arr4);
	   
	   System.out.println("the minimum element is " + min);

	}

	private static int findMinInRotatedSortedArray(int[] input) {
		// TODO Auto-generated method stub
		
		int low=0;
		int high=input.length-1;
		
		while(low<high)
		{
			int mid=low+(high-low)/2;
			
			if(input[mid]>input[high])
			{
				low=mid+1;
				
			}else if (input[mid]<input[high])
			{
				high=mid;
			}else{
			    high--;
			}
			
			
		}
		return input[low];
	}

}
