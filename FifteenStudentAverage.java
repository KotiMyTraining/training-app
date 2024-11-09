package com.internalEvolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.ToIntFunction;

public class FifteenStudentAverage {

	public static void main(String[] args) {
		
		String[][] input= {{"Charles","84"},
		           {"John","100"},
		           {"Andy","37"},
		           {"John","23"},
		           {"Charles","20"}};

        findHighestAverage(input);

	}

	private static void findHighestAverage(String[][] input) {
		// TODO Auto-generated method stub
		
		HashMap<String,List<Integer>> studentMap=new HashMap();
		
		for(String[] student:input)
		{
			String name=student[0];
			int marks=Integer.parseInt(student[1]);
			if(studentMap.containsKey(name))
			{
			studentMap.get(name).add(marks);
			}
			else
			{
				List<Integer> marksList=new ArrayList();
				marksList.add(marks);
				studentMap.put(name,marksList);
				
			}
		}
		
		double average=0.0;
		double highestAverage=0.0;
		String studentName="";
		
		for(Entry<String,List<Integer>> studentEntry:studentMap.entrySet())
		{
			
			List<Integer> marksList=studentEntry.getValue();
			
			double avg=marksList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
			if(avg>highestAverage)
			{
				highestAverage=avg;
				studentName=studentEntry.getKey();
			}
			
		}
		
		System.out.println(highestAverage);
		System.out.println(studentName);
		
	}

	private static ToIntFunction<? super Integer> Integer(Object intValue) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object intValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
