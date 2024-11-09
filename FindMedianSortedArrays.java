package com.internalEvolution;

public class FindMedianSortedArrays {

	public static void main(String[] args) {
		
		int[] input1= {2,3,5,13,15,17};
		int[] input2= {10,12,14,16,18,20};
		
		Double median=findMedianOfSortedArrays(input1,input2);
		System.out.println(median);
		
		

	}

	private static Double findMedianOfSortedArrays(int[] nums1, int[] nums2) {
		
		int m=nums1.length;
		int low=0;
		int high=m;
		int n=nums2.length;
		
		
		while(low<=high)
		{
		  int partition1=(low+high)/2;
		  int partition2=(m+n+1)/2-partition1;
		  
		  int maxLeft1=(partition1==0)?Integer.MIN_VALUE:nums1[partition1-1];
		  int minRight1=(partition1==m)?Integer.MAX_VALUE:nums1[partition1];
			
		  int maxLeft2=(partition2==0)?Integer.MIN_VALUE:nums2[partition2-1];
		  int minRight2=(partition2==n)?Integer.MAX_VALUE:nums2[partition2];
		  
		  if(maxLeft1<=minRight2 && maxLeft2<=minRight1)
		  {
			  
			  if((m+n)%2==0)
			  {
				  return ((double)Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2))/2;
			  }else
			  {
				  return (double) Math.max(maxLeft1, maxLeft2);
			  }
			  
		  }else if(maxLeft1>minRight2)
		  {
			  high=partition1-1;
		  }else
		  {
			  low=partition1+1;
		  }
		  
			
		}
		
		return 0.0;
	}

}
