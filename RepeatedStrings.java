package com.internalEvolution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatedStrings {

	
	
	public static void main(String... args)
	{
		 String[][] arr = {
		            {"apple", "banana", "apple"},
		            {"orange", "banana", "apple"},
		            {"grape", "banana", "grape"}
		        };
		 
		 
		      Arrays.stream(arr).flatMap(a->Stream.of(a)).collect(Collectors.groupingBy(s->s,Collectors.counting()))
		      .entrySet().stream().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
		      
		      
		      int[] array= {2,4,5,68,9};
		      
		      OptionalInt secondSmallest=Arrays.stream(array).distinct().sorted().skip(1).findFirst();
		      
		      System.out.println(secondSmallest);
		      
		  Optional<Integer> secondLargest=    Arrays.stream(array).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	     
		  System.out.println(secondLargest);
		  
		  int sum=secondSmallest.getAsInt()+secondLargest.get();
		  
		  System.out.println("the total sum is "+ sum);
		  
		  
		  String user=System.getenv("username");
		  System.out.println(user);
		  
		  Properties props=new Properties();
		 try {
			FileInputStream reader=new FileInputStream("config.properties");
			try {
				props.load(reader);
				
				System.out.println("username "+props.getProperty("username"));
				System.out.println("password" + props.getProperty("password"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
	}
}
