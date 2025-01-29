package com.internalEvolution;

public class DiagonalMatrixChecker {
    public static boolean isDiagonalMatrix(int[][] matrix) {
       int n=matrix.length;
       
       for(int i=0;i<n;i++)
       {
    	  if(matrix[i].length!=n)
    	  {
    		  return false;
    	  }
       }
       
       for(int i=0;i<n;i++)
       {
    	   for (int j=0;j<n;j++)
    	   {
    		   if(i!=j&&matrix[i][j]!=0)
    		   {
    			   return false;
    		   }
    	   }
       }
       
       return true;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {3, 0, 0},
            {0, 5, 0},
            {0, 0, 7}
        };

        int[][] matrix2 = {
            {1, 2, 0},
            {0, 4, 0},
            {0, 0, 6}
        };

        System.out.println("Matrix 1 is diagonal: " + isDiagonalMatrix(matrix1)); // true
        System.out.println("Matrix 2 is diagonal: " + isDiagonalMatrix(matrix2)); // false
    }
}