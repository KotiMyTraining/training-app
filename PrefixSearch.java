package com.testOctTen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrefixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      String[] input= {"apple","applet","bread","aper"};
      String prefix="app";
		
		List<String> resultList=findWordsStartingWithPrefix(input,prefix);
		
		System.out.println(resultList);

	}

	private static List<String> findWordsStartingWithPrefix(String[] input,String prefix) {
		// TODO Auto-generated method stub
		
		List<String> resultList=new ArrayList<>();
		for(String word:input)
		{
			if(word.startsWith(prefix))
			{
				resultList.add(word);
			}
		}
		return resultList;
	}

}
 