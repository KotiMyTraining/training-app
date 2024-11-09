package com.internalEvolution;

import java.util.HashMap;
import java.util.Map.Entry;

public class SixteenMaxIpAddress {

	public static void main(String[] args) {
		
		  String[] str = {
	                "10.0.0.1 bytes=32 time=50ms TTL=63",
	                "10.0.0.2 bytes=32 time=50ms TTL=73",
	                "10.0.0.4 bytes=32 time=50ms TTL=83",
	                "10.0.0.2 bytes=32 time=50ms TTL=93"
	        };

	        System.out.println("Most frequent IP address: " + findMaxOccurrenceIP(str));


	}
	
	public static String findMaxOccurrenceIP(String[] input)
	{
		HashMap<String,Integer> ipAddressMap=new HashMap(); 
		for(String record: input)
		{
			String[] ipAddress=record.split(" ");
			for(String parts:ipAddress)
			{
			if(ipValid(parts))
			{
				if(ipAddressMap.containsKey(parts))
				{
					ipAddressMap.put(parts, ipAddressMap.get(parts)+1);
				}else
				{
					ipAddressMap.put(parts, 1);
				}
				
				
			}
			}
		}
		
		String maxIp="";
		int maxIpCount=0;
		
		for(Entry<String,Integer> ip:ipAddressMap.entrySet())
		{
			if(ip.getValue()>maxIpCount)
			{
				maxIpCount=ip.getValue();
				maxIp=ip.getKey();
			}
		}
		return maxIp+"  times  "+maxIpCount;
	}
	
	private static boolean ipValid(String ipAddress) {
		// TODO Auto-generated method stub
		
		String[] octets=ipAddress.split("\\.");
		
		if(octets.length<4)
		{
			return false;
		}
		
		for(String octet:octets)
		{
			try {
			int value=Integer.parseInt(octet);
			if(value<0 || value>  255)
			{
				return false;
			}
			}catch(NumberFormatException e)
			{
				return false;
			}
		}
		return true;
	}

	
	

}
 