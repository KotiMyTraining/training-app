package com.testOctTen;

public class LongestWordInDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input=  {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
		String searchString="ODG";
		
		String result=findLongestWordInDictionary(input,searchString);
		
		if(result!=null && !result.isEmpty())
		{
			System.out.println("the result is "+result);
		}else
		{
			System.out.println("invalid input");
		}

	}

	private static String findLongestWordInDictionary(String[] input, String searchString) {
		// TODO Auto-generated method stub
		
		String maxLengthString="";
		int maxLength=0;
		
		if(input==null)
		{
			return null;
		}
		
		for(String s:input)
		{
			if(s.toLowerCase().contains(searchString.toLowerCase()))
			{
				if(maxLength<s.length())
				{
					maxLength=s.length();
					maxLengthString=s;
				}
			}
		}
		
		return maxLengthString;
		
	}

}
