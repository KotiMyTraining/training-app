package com.internalEvolution;

public class TrappingRainWaterSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] input={4,2,0,3,2,5};
		int[] input1 = {0,1,0,2,1,0,1,3,2,1,2,1};
		
	   
		int result=trappingRainWaterSolution(input1);
		System.out.println("the total result is "+result);

	}

	private static int trappingRainWaterSolution(int[] height) {
		// TODO Auto-generated method stub
		
		
		int left=0;
		int right=height.length-1;
		int maxLeft=0;
		int maxRight=0;
		
		int waterTrappedResult=0;
		
		if (height == null || height.length < 2) {
		    return 0; // Or handle as appropriate for your program
		}
		while(left<right)
	    {
	    	if(height[left]<=height[right])
	    	{
	    		if(height[left]>maxLeft)
	    		{
	    			maxLeft=height[left];
	    		}else
	    		{
	    			waterTrappedResult+=maxLeft-height[left];
	    		}
	    		left++;
	    	}else
	    	{
	    		if(height[right]>=maxRight)
	    		{
	    			maxRight=height[right];
	    		}else
	    		{
	    			waterTrappedResult+=maxRight-height[right];
	    		}
	    		right--;
	    	}
	    }
		
		return waterTrappedResult;
	}

}
