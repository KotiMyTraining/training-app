package com.internalEvolution;

public class SecondLongestWordInDictionary {
	
	
	public static void main(String... args)
	{
		String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
		String toSearch = "ODG";
		
		findSecondLongestWord(dict);
	}
	

	//Returns 9 (LODGESSSS)"

   public static void findSecondLongestWord(String[] dict)
   {
	   int longest=0;
	   
	   String result="";
	   
	   for(String word:dict)
	   {
		   if(word.length()>longest)
		   {
			   longest=word.length();
			   result=word;
		   }
		   
	   }
	   System.out.println(result);
	   System.out.println(result.length());
	   
   }
}
 