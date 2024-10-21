package com.practiceafterten;

public class PascalTriangle {

	public static void main(String[] args) {
        
		int [] prevRow=new int[] {1};
		
	
		  // Print the first few rows of Pascal's Triangle
        for (int i = 0; i < 6; i++) {
            // Print the current row
        	
        	
            printRow(prevRow,6-i);
            // Get the next row
            prevRow = getNextRow(prevRow);
        }
		
		
	}

	private static int[] getNextRow(int[] prev) {
		
		int[] result=new int[prev.length+1];
		
		
		result[0]=1;
		
		for(int i=1;i<prev.length;i++)
		{
			
			result[i]=prev[i-1]+prev[i];
			
			
		}
		result[result.length-1]=1;
		
		return result;
				
				
				
		
	}
	
	private static void printRow(int[] row,int spaces) {
		for (int j = 0; j < spaces; j++) {
            System.out.print("  "); // Adjust this for more or fewer spaces
        }
        // Print the row values
        for (int value : row) {
            System.out.printf("%-4d",value); // Extra spaces between numbers for better separation
        }
        System.out.println();
    }

}
