package com.internalEvolution;

import java.util.Stack;

public class TrappingRainWaterUsingStack {
	
	

	public static void main(String[] args) {
		
		
		 int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
	        int[] height2 = {4, 2, 0, 3, 2, 5};

	        System.out.println("Trapped water for height1: " + trap(height1)); 
	        System.out.println("Trapped water for height2: " + trap(height2)); 

	}
	
	public static int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int totalWater = 0;

        for (int current = 0; current < height.length; current++) {
            
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop(); 
                
                if (stack.isEmpty()) {
                    break; 
                }

                int distance = current - stack.peek() - 1; 
                int boundedHeight = Math.min(height[current], height[stack.peek()]) - height[top];
                
                totalWater += distance * boundedHeight; 
            }

            stack.push(current);
        }

        return totalWater;
	}
	

}
