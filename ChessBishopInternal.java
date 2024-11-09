package com.internalEvolution;

public class ChessBishopInternal {

	public static void main(String[] args) {

		  int bishopRow = 2, bishopCol = 2; // Bishop's starting position
	        int targetRow = 8, targetCol = 8; // Immoveable piece's position
	        
	        System.out.println(canReach(bishopRow, bishopCol, targetRow, targetCol));
	}

	private static String canReach(int bishopRow, int bishopCol, int targetRow, int targetCol) {
		// TODO Auto-generated method stub
		
		if(!isValidPosition(bishopRow, bishopCol) && !isValidPosition(targetRow, targetCol))
		{
			return "invalid position";
		}
		
		if((bishopRow+bishopCol)%2!=(targetRow+targetCol)%2)
		{
			return "different colours not reachable";
		}
		
		if(Math.abs(bishopRow-targetRow)==Math.abs(Math.abs(targetRow-targetCol)))
       {
	       return "1";
       }else {
    	   return "2";
       }
		
		
	}
	
	public static boolean isValidPosition(int row,int col)
	{
		return row>=1&& row<=8 && col>=1&& col<=8;
	}

}
