package com.internalEvolution;

public class LoopChecker1 {

	public static void main(String[] args) {

		
		int[] arr = {2, -1, -1, 2, 2};
        int loopLength = calculateLoopLength(arr);
        System.out.print(loopLength);
	}

	 public static int calculateLoopLength(int[] arr) {
		 
		 int len=0;
		 int cal=0;
		 boolean[] isVisited=new boolean[5];
		int  n=arr.length;
		int i=0;
		 
		 if(arr.length==0)
		 {
			 return -1;
			 
	      }
		 
		 while(true)
		 {
			 
			 
			 if(isVisited[i])
			 {
				 return -1;
			 }
			 
			 if(arr[i]>0)
			 {
				 cal=(i+arr[i])%n;
				 
			 }else
			 {
				 cal=(i-arr[i])%n;
			 }
			 
			 isVisited[i]=true;
			 
			 i=cal;
			 len+=1;
			 if(i==0)
			 {
				 return len;
			 }
		 }
		 
	 
	 
	    }

}
