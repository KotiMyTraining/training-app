package com.coderpadtest;

import java.util.HashSet;
import java.util.Set;

public class LoopChecker {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {2, -1, 1, 2, 2};
	        String result = checkLoop(arr); // Check for a loop in the array
	        System.out.println(result);

	}
	
	
	 public static String checkLoop(int[] arr) {
	        int n = arr.length;
	        Set<Integer> visited = new HashSet<>(); // Set to track visited indices
	        int curr = 0; // Start from index 0
	 
	        while (true) {
	            if (visited.contains(curr)) {
	                return "yes"; // If the current index has been visited, a loop is found
	            }
	            if (arr[curr] == 0 || curr == (curr + arr[curr]) % n) {
	                return "no"; // If a zero is encountered or the next index 
	                             // leads back to the current index, no loop exists
	            }
	            visited.add(curr); // Mark the current index as visited
	            curr = (curr + arr[curr]) % n; // Move to the next index based on the array 
	                                           // element's value
	        }
	    }
	 

}
