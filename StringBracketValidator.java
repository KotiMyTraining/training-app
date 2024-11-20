package com.internalEvolution;

import java.util.Stack;

public class StringBracketValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String input1 = "(a + (b -c) +z) - z)";
	        String input2 = "(a + (b -c) +z - z)";
	        String input3 = "((a + (b -c) +z - z)";
	        String input4= "(a + {b -c)  +z}";
	        String input5 = "y + (a + (b -c) +z - z)";
	       
	     System.out.println("the resultant bracket validator is "+ bracketValidator(input1));

	}

	private static boolean bracketValidator(String input) {
		// TODO Auto-generated method stub
		
		
		Stack<Character> stack=new Stack();
		
		
		for(Character ch:input.toCharArray())
		{
		
			 if (ch == '(' || ch == '{' || ch == '[') {
	                stack.push(ch);
	            } 
			 
			 else if (ch == ')' || ch == '}' || ch == ']') {
	                if (stack.isEmpty()) {
	                    return false; 
	                }
			
	                char top=stack.peek();
	                
	                if ((ch == ')' && top == '(') ||
	                        (ch == '}' && top == '{') ||
	                        (ch == ']' && top == '[')) {
	                        stack.pop(); 
	                    } else {
	                        return false; 
	                    }
	                
		}
		
	}
		return stack.isEmpty();
	}
}


