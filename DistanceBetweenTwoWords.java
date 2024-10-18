package com.testOctTen;

import java.util.HashMap;

public class DistanceBetweenTwoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String input="the quick the brown quick brown the frog";
		
		String searchString1="quick";
		String searchString2="frog";
		
	int result=findMinDistaceBetweenWords(input,searchString1,searchString2);
	System.out.println("result " + result);
		

	}

	private static int findMinDistaceBetweenWords(String input, String searchString1, String searchString2) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> indexMap=new HashMap<String,Integer>();
		int minDistance=Integer.MAX_VALUE;
		
		String[] words=input.split(" ");
		
		for(int i=0;i<words.length;i++) {
			
			if(words[i].equals(searchString1) || words[i].equals(searchString2))
			{
				indexMap.put(words[i], i);
			}
			
			if(indexMap.containsKey(searchString1)&&indexMap.containsKey(searchString2))
			{
				int distance=Math.abs(indexMap.get(searchString2)-indexMap.get(searchString1))-1;
				
				if(distance<minDistance)
				{
					minDistance=distance;
				}
			}
			
		}

	

		
		return minDistance;
	}

}
