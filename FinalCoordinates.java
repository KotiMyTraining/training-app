package com.testOctTen;

public class FinalCoordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="UUU";
		String input1="URRDDL";
		String input2="DOWN UP 2xRIGHT DOWN 3xLEFT";
		int x=0;
		int y=0;
		
		String result=findFinalCoordinates(input2,x,y);
		System.out.println(result);

	}

	private static String findFinalCoordinates(String input, int x, int y) {
		// TODO Auto-generated method stub
		
		StringBuilder directionBuilder=new StringBuilder();
		 if(input.contains("x"))
		 {
			 
			String[] directions=input.split(" ");
			
			for(String direction:directions)
			{
				if(direction.contains("x"))
				{
					
					String[] partitions=direction.split("x");
					int count=Integer.parseInt(partitions[0]);
					String move=partitions[1];
					
					for(int i=0;i<count;i++)
					{
						String symbol=getSymbolDirection(move);
						directionBuilder.append(symbol);
					}
					
				}else
				{
					
					String symbol=getSymbolDirection(direction);
					directionBuilder.append(symbol);
				}
					
					
			}
			  return calculateDirection(directionBuilder.toString(), x, y);
		 }else
		 {
		 return calculateDirection(input, x, y);
		 }
		
		
	}
	
	
	
	public  static String calculateDirection(String input, int x, int y)
	{
		
		String[] directions=input.split("");
		
		for(String direction:directions)
		{
		switch(direction)
		{
		case "U": y+=1;
		 break;
		case "D": y-=1;
		break;
		case "L": x-=1;
		break;
		case "R": x+=1;
		break;
		}
		}
		
		return "("+x+" ,"+y+")";
	}
	
	private static String getSymbolDirection(String direction) {
		// TODO Auto-generated method stub
		
		switch(direction)
		{
		case "UP":return "U"; 
		case "DOWN":return "D";
		case "LEFT":return "L";
		case "RIGHT":return "R";
		default:  throw  new IllegalArgumentException("invalid move");
		
		}
	}

}
