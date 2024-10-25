package com.coderpadtest;

import java.util.Arrays;

public class MedianOfSortedArraysNormalApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1= {1,3,5,10};
		int[] nums2= {8,12,14};
		
		
		int[] nums3= {1,2};
		int[] nums4= {3,4};
		
		int[] nums5= {5};
		int[] nums6= {};
		
		
		double result=findMedianOfSortedArrays(nums5,nums6);
		System.out.println(result);

	}

	private static double findMedianOfSortedArrays(int[] nums1, int[] nums2) {
		
		int[]  mergedArray=new int[nums1.length+nums2.length];
		
		for(int i=0;i<nums1.length;i++)
		{
			mergedArray[i]=nums1[i];
		}
		
		int k=nums1.length;
		for(int i=0;i<nums2.length;i++)
		{
			mergedArray[k]=nums2[i];
			k++;
		}
		
		System.out.println(Arrays.toString(mergedArray));
		 
		 int n = mergedArray.length;

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            // Find the index of the minimum element in the unsorted portion
	            for (int j = i + 1; j < n; j++) {
	                if (mergedArray[j] < mergedArray[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            // Swap the found minimum element with the first element of the unsorted portion
	            int temp = mergedArray[minIndex];
	            mergedArray[minIndex] = mergedArray[i];
	            mergedArray[i] = temp;
	        }
		
	        System.out.println(Arrays.toString(mergedArray));
	        
	        double average=0.0;
	        
	        int midIndex=mergedArray.length/2;
	        
	        if(mergedArray.length%2==0)
	        {
	        	average=((double)(mergedArray[midIndex]+mergedArray[midIndex-1]))/2;
	        }else
	        {
	        	average=(double)mergedArray[midIndex];
	        }
		
		return average;
	}

}
