package com.internalEvolution;

import java.util.*;
import java.util.stream.*;

public class StudentAverageExampleUsingStreamsPractice {
    public static void main(String[] args) {
        String[][] input = {
            {"Charles", "84"},
            {"John", "100"},
            {"Andy", "37"},
            {"John", "23"},
            {"Charles", "20"}
        };
        
        
  Map.Entry<String,Double> entry= Arrays.stream(input)
        .collect(Collectors.groupingBy(
        		data->data[0],
        		Collectors.mapping(
        		data->Integer.parseInt(data[1]),
        		Collectors.averagingInt(Integer::intValue))))
                .entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
  
  if (entry != null) {
      System.out.println("Student with the highest average marks:");
      System.out.println("Name: " + entry.getKey());
      System.out.println("Average Marks: " + entry.getValue());
  } else {
      System.out.println("No students.");
  }
        
      


}
    
}
