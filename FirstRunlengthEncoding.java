package com.internalEvolution;

public class FirstRunlengthEncoding {
	
	public static void main(String... args)
	{
		String input="aabbbccdddc";
		
		String result=findRunLengthEncoding(input);
		System.out.println(result);
	}
	
	
	

	private static  String findRunLengthEncoding(String input) {
		
	  int length=input.length();
	  
	  StringBuilder result=new StringBuilder();
	  
	  for(int i=0;i<length;i++)
	  {
		 
		  int count=1;
		  
		  while(i<length-1 && input.charAt(i)==input.charAt(i+1))
		  {
			  i++;
			  count++;
		  }
	    result.append(input.charAt(i));
	    result.append(count);
      }
		
		
		return result.toString();
		
	}
	
	
	

}
