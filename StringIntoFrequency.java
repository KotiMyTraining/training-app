package com.testOctTen;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringIntoFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="aabbb";
		String input1="aaaa";
		String input2="a";
		
		Map<Character, Long> result=convertStringIntoFrequency(input);
		
		if(result!=null)
		{
			result.forEach((key,value)->System.out.print(key+""+value));
			
			
			
			/*
			 * System.out.println("printing the map another way");
			 * 
			 * result.entrySet().forEach(entry->System.out.print(entry.getKey()+""+entry.
			 * getValue()));
			 */
		}

	}

	private static Map<Character, Long> convertStringIntoFrequency(String input) {
		// TODO Auto-generated method stub
		
		if(input==null && input.isEmpty())
		{
			return null;
		}
		
		Map<Character,Long> resultMap=input.chars().mapToObj(c->(char)c)
				                      .collect(Collectors.groupingBy
				                    		  (Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		
		
		
		return resultMap;
	}

}
