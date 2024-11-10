package com.internalEvolution;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=5;
		
	List<List<Integer>> traingle=generatePascalTriangle(n);
	
	System.out.println(traingle.toString());
	
	printTraingle(traingle);
		
	}

	private static void printTraingle(List<List<Integer>> traingle) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<traingle.size();i++)
		{
			
			for(int j=0;j<traingle.size()-i-1;j++)
			{
				System.out.print("  ");
			}
			
			for(int value:traingle.get(i))
			{
				System.out.printf("%-4d",value);
			}
			System.out.println();
		}
		
		
	}

	private static List<List<Integer>> generatePascalTriangle(int n) {
		
		List<List<Integer>> triangle=new ArrayList();
		if(n==0) return triangle;
		
		
		for(int i=0;i<n;i++)
		{
			List<Integer> row=new ArrayList();
			
			row.add(1);
			
			for(int j=1;j<i;j++)
			{
				int prev=triangle.get(i-1).get(j-1);
				int current=triangle.get(i-1).get(j);
				
				row.add(prev+current);
			}
			
			if(i>0)
			{
				row.add(1);
				
				
			}
			triangle.add(row);
		}
		
		
		
		return triangle;
		
	}

}
