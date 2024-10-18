package com.practiceafterten;


public class RotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input= {5,6,1,2,3,4};
		int[] input1 = {1, 2, 3, 4, 5, 6};
		
		int[] input2= {6, 1, 2, 3, 4, 5};
		
		int[] input3 = {100, 200, 300,500,600, 1, 10, 50,60,70,80};
		
		int[] input4 = {2, 1};
		
		int [] input5={10};
		
		int[] input6={3, 4, 5, 1, 2};
		int[] input7= {7,7,7,7,7};
		
		int minElement=findMinElementInSortedArray(input3);
		
		System.out.println("the minimum element is "+minElement);

	}

	private static int findMinElementInSortedArray(int[] input) {
		// TODO Auto-generated method stub
		
		int low=0;
		int high=input.length-1;
		int minElement=Integer.MAX_VALUE;
		
		while(low<high)
		{
			
			int mid=low+(high-low)/2;
			
			if(input[mid]>input[high]) {
				low=mid+1;			
		} else{
				high=mid;
			}
			
			
			
			
		}
		
		return input[low];
	}

}
