package com.internalEvolution;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondLargestAndSecondSmallest {
	
	
  public static void main(String[] args)
  {
	  int[] array= {3,5,6,10,9,45,34,2};
	  
	  findSecondLargeAndSmall(array);
  }

private static void findSecondLargeAndSmall(int[] array) {
	// TODO Auto-generated method stub
	
	
	int secondLargest=Integer.MIN_VALUE;
	int secondSmallest=Integer.MAX_VALUE;
	
	int largest=0;
	int smallest=Integer.MAX_VALUE;
	
    for(int value:array)
    {
    	if(value>largest)
    	{
    		secondLargest=largest;
    		largest=value;
    		
    		
    	 }else if(value >secondLargest && value!=largest)
    	 {
    		 secondLargest=value;
    	 }
    	
    	if(value<smallest)
    	{
    		secondSmallest=smallest;
    		smallest=value;
    		
    	}else if(value<secondSmallest && value!=smallest)
    	{
    		secondSmallest=value;
    	}
    }
	
	System.out.println(secondLargest);
	System.out.println("the smallest value is "+secondSmallest);
	
	
	List<Integer> list=Arrays.stream(array)
	.distinct().sorted().boxed().collect( Collectors.toList());
	
	System.out.println("the second largest is "+ list.get(list.size()-2));
	System.out.println("the second smalles is " + list.get(1));
	
}

}
