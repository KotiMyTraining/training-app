package com.testOctTen;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="12345";
		
		String input1="jjkkssser";	
		
		Optional<Entry<Character, Long>> resultMap=findFirstNonRepeatingCharacter(input1);
		
		if(resultMap.isPresent())
		{
			System.out.println("the result is "+ resultMap.get().getKey());
		}else {
			System.out.println("all characters are repeated");
		}

	}

	private static Optional<Entry<Character, Long>> findFirstNonRepeatingCharacter(String input) {
		
		if(input==null && input.isEmpty())
		{
			return null;
		}
		
	    Optional<Entry<Character,Long>> resultMap=input.chars().mapToObj(c->(char)c)
				                      .collect(Collectors.groupingBy
				                   (Function.identity(),LinkedHashMap::new,Collectors.counting()))
				                     .entrySet().stream().filter(entry->entry.getValue()==1).findFirst();
				                      
		
		
		
		
		return resultMap;
		
		
	}

}
