package com.coderpadtest;

public class CircleWinner {
	
	public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println("winner is " + findTheWinner(n, k));
    }

	 public static int findTheWinner(int n, int k) {
	        int result = 0; // Base case for n=1
	        for (int i = 2; i <= n; i++) {
	            result = (result + k) % i;
	        }
	        return result + 1; // Convert 0-based index to 1-based
	    }


}
