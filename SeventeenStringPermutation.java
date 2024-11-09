package com.internalEvolution;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SeventeenStringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		
	    String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
	    String input = "abcd";
	    // Return {"abcd", "bcad"}

	    String[] dict1 =  {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
	    String input1 = "caab";
	    // Return {"acab"}"
	    
	    List<String> resultList=findStringPermutationMatchingWords(dict1,input1);
	    
	    System.out.println(resultList.toString());
	    		   
	    
	    

	}

	private static List<String> findStringPermutationMatchingWords(String[] dict, String input) {
		// TODO Auto-generated method stub
		 List<String> resultList=new ArrayList<String>();
	    Map<Character,Long> inputMap=input.chars().mapToObj(c->(char)c)
	    		                         .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	    for(String word:dict)
	    {
	    	 Map<Character,Long> dictWordMap=word.chars().mapToObj(c->(char)c)
                     .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	    	 
	    	 if(dictWordMap.equals(inputMap))
	    	 {
	    		 resultList.add(word);
	    	 }
	    }
	    
		return resultList;
	}

}
