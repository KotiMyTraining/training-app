package com.internalEvolution;

import java.util.ArrayList;
import java.util.List;

public class MaxPathSumMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 10, 2, 0, 20, 4},
            {1, 0, 0, 30, 2, 5},
            {0, 10, 4, 0, 2, 0},
            {1, 0, 2, 20, 0, 4}
        };

       int maxSum = findMaxPathSum(matrix);
        System.out.println("Maximum Path Sum: " +maxSum);
    }

   

    public static int  findMaxPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // dp to store the maximum sum to each cell
        int[][] dp = new int[m][n];
        dp[0][0] = matrix[0][0];

        // Fill dp table using dynamic programming
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int currentValue = matrix[i][j];
                if (i > 0) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + currentValue);
                if (j > 0) dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + currentValue);
                if (i > 0 && j > 0) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + currentValue);
            }
        }

        // Result with maxSum and path
        int maxSum = dp[m - 1][n - 1];
       

        return maxSum;
    }
}