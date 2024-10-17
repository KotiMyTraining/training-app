package com.testOctTen;

public class CustomAtoiFunction {

	public static void main(String[] args) {
       String input="+124";
       String input1="-123";
       String input2="1a23";
       
           int result= createCustomAtoiFunction(input2);
           
           System.out.println(" the result is "+ result);
    		   
	}

	private static int createCustomAtoiFunction(String input) {
		// TODO Auto-generated method stub
		
		char[] charArray=input.toCharArray();
		int index=0;
		int sign=1;
		 int result=0;
		
		if(charArray[0]=='+')
		{
			index++;
			 result=convertInputToIneger(charArray,index);
			 return result*sign;
		}
		
		else if(charArray[0]=='-')
		{
			sign=-1;
			index++;
			 result=convertInputToIneger(charArray,index);
			 return result*sign;
		}else
		{
		
		  result=convertInputToIneger(charArray,index);
		  return result*sign;
				 
		}			 
		
		
	}

	private static int convertInputToIneger(char[] charArray, int index) {
		// TODO Auto-generated method stub
		
		int result=0;
		
		while(index<charArray.length)
		{
			if(Character.isDigit(charArray[index]))
			{
				int charValue=charArray[index]-'0';
				result=result*10+charValue;
				index++;
			}else
			{
				return -1;
			}
		}
		
		return result;
	}

}
