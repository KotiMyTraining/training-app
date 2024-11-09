package com.internalEvolution;

public class TwentytwoStairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
		
		int count=findStairCase(n);
		System.out.println(count);

	}

	private static int  findStairCase(int n) {
		
		
		int[] dp = new int[n + 1];
		  
        // Base cases
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2]; 
  
        return dp[n];
    

}
}
