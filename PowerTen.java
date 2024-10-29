package com.coderpadtest;

public class PowerTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=999;
		 System.out.println( "the no is divisable by 10 "+ resutlfindNoPowerByTen(input));

	}

	private static  boolean resutlfindNoPowerByTen(int input) {
		
		if(input<=0)
		{
			return false;
		}
		while(input>1 && input%10==0)
		{
			input/=10;
		}
		
		
        return input==1;	
	}

}
