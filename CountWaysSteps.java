package com.coderpadtest;

public class CountWaysSteps {
	
	
	static int countWaysSteps(int n) {
        int[] dp = new int[n + 1];
  
        // Base cases
        dp[0] = 1;//for 0 th step
        dp[1] = 1;// for first step

        for (int step = 2; step <= n; step++)
            dp[step] = dp[step - 1] + dp[step - 2]; 
  
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countWaysSteps(n));
    }

}
