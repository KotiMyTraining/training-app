package com.testOctTen;

public class MedianSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1= {1,3,5,8};
		int[] nums2= {10,12,14,16,18,20};
		
		int[] nums3= {1,3,7,8,9,20};
		int[] nums4= {15,18,19,21,25,35,45};
		
		double result=findMedianOfSortedArrays(nums3,nums4);
		System.out.println(result);


	}

	private static double findMedianOfSortedArrays(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		
		if(nums1.length>nums2.length)
		{
			findMedianOfSortedArrays(nums2, nums1);
		}
		
		int low=0;
		int m=nums1.length;
		int n=nums2.length;
		int high=m;
		
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
					return (double)	((Math.max(maxLeft1,maxLeft2)+Math.min(minRight1,minRight2))/2);
				}else
					
					return (double) Math.max(maxLeft1,maxLeft2);
					
					
			
		}else if(maxLeft1>minRight2)
		{
			high=partition1-1;
		}else
		{
			low=partition1+1;
		}
		
		
	}
		return 0;
}
}
