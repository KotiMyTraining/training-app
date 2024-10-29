package com.coderpadtest;

public class ChessBishop {

	public static void main(String[] args) {
		
		  int bishopRow = 2, bishopCol = 2; // Bishop's starting position
	        int targetRow = 8, targetCol = 8; // Immoveable piece's position
	        
	        System.out.println(canReach(bishopRow, bishopCol, targetRow, targetCol));

	}

	private static String canReach(int bishopRow, int bishopCol, int targetRow, int targetCol) {
		
		
		 if (!isValidPosition(bishopRow, bishopCol) || !isValidPosition(targetRow, targetCol)) {
	            return "Invalid Position"; // Return an error message if positions are out of bounds
	        }
		 // Step 1: Check if reachable based on parity of row and column indices
		if((bishopRow+bishopCol)%2!=(targetRow+targetCol)%2)
		{
			return "No";//If the parity doesn't match, it’s unreachable
		}
		
		
		   // Step 2: Calculate moves
        // Case 1: If on the same diagonal, only 1 move is required
		if(Math.abs(bishopRow-targetRow)==Math.abs(bishopCol-targetCol))
		{
			return "yes,1";
		}else
		{
			return "yes,2";
		}
		
		
		// Case 2: If on a different diagonal but reachable, it takes exactly 2 moves
		
	}
	
	 private static boolean isValidPosition(int row, int col) {
	        return row >= 1 && row <= 8 && col >= 1 && col <= 8;
	    }

}
