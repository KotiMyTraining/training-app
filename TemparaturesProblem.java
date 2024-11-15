package com.coderpadtest;

import java.util.Arrays;
import java.util.Stack;

public class TemparaturesProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] temperatures = {73,74,75,71,69,72,76,73};
		
		System.out.println(Arrays.toString(findingWarmerTempDay(temperatures)));
		
		

	}
	
	private static int[] findingWarmerTempDay(int[] temp) {
        int n = temp.length;
        Stack<Integer> st =new Stack<>();
        int res[] =new int[n];
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && temp[i]> temp[st.peek()]){
                int index= st.pop();
                res[index]=i-index;
 
            }
            st.push(i);
 
        }

   return res;
	}}
