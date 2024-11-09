package com.internalEvolution;

public class FourteenPowerten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=76;
		boolean result=checkPowerten(input);
		System.out.println(result);

	}

	private static boolean checkPowerten(int input) {
		// TODO Auto-generated method stub
		
		if(input<0)
		return false;
		
	     while (input>1 && input%10==0)
		{
			input/=10;
		}
		
		return input==1;
	}

}
