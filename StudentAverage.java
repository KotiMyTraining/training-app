package com.practiceafterten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;

public class StudentAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] input= {{"Charles","84"},
				           {"John","100"},
				           {"Andy","37"},
				           {"John","23"},
				           {"Charles","20"}};

		   findHighestAverage(input);
		
	}

	private static void findHighestAverage(String[][] input) {
		// TODO Auto-generated method stub
		
		Map<String, List<Integer>> studentMap=new HashMap<String, List<Integer>>();
		
		for(String[] student: input)
		{
			String studentName=student[0];
			int marks=Integer.parseInt(student[1]);
			
			if(studentMap.containsKey(studentName))
			{
				studentMap.get(studentName).add(marks);
			}else
			{
				List<Integer> marksList=new ArrayList<Integer>();
				marksList.add(marks);
				
				studentMap.put(studentName, marksList);
			}
			
			
		}
		
		//System.out.println(studentMap.toString());
		
		double highestAverage=0.0;
		String highestAverageStudentName="";
		
		 for(Entry<String,List<Integer>> entry:studentMap.entrySet())
		 {
			 
			 String studentName=entry.getKey();
			 List<Integer> allMarks=entry.getValue();
			 
			 double average=allMarks.stream()
					                 .mapToInt(Integer::intValue).average().orElse(0.0);
			 
			 
			 System.out.println("the studnet name "+ studentName + " "+ average);
			 
			 if(average>highestAverage)
			 {
				 highestAverage=average;
				 highestAverageStudentName=studentName;
			 }
			 
		 }
		
		 System.out.println(" the highest student with average is " +highestAverageStudentName  + "  "+ highestAverage);
	}

}
