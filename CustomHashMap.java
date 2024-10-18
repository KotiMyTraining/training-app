package com.test;

import java.util.LinkedList;


public class CustomHashMap<k,v> {
	
	private LinkedList<Entry<k,v>>[] buckets;
	
	int size;
	
	private static int DEFAULT_CAPACITY=16;
	
	private int capacity;
	
	private  float LOAD_FACTOR=0.75f;
	
	static class Entry<k,v>
	{
		k key;
		v value;
		
		Entry(k key,v value)
		{
			this.key=key;
			this.value=value;
			
		}
	}
	
	CustomHashMap ()
	{
		this(DEFAULT_CAPACITY);
	}

	public CustomHashMap(int capacity) {
		// TODO Auto-generated constructor stub
		
		this.capacity=capacity;
		this.size=0;
		buckets=new LinkedList[capacity];
		for(int i=0;i<capacity;i++)
		{
			buckets[i] =new LinkedList<>();
		}
		
		
	}
	
	public int getHashIndex(k key)
	{
		return Math.abs(key.hashCode())%capacity;
	}
	
	
	public void put(k key,v value)
	{
		
		if((float)(size/capacity)>=LOAD_FACTOR)
		{
			resize();
		}
		
		
		int index=getHashIndex(key);
		LinkedList<Entry<k,v>> bucket  = buckets[index];
		for(Entry<k,v> entry:bucket)
		{
			if(entry.key.equals(key))
			{
				entry.value=value;
				return;
			}
		}
		
		bucket.add(new Entry<k,v>(key,value));
		
		size++;
	
		
	}
	
	
	public v get(k key)
	{
		int index=getHashIndex(key);
		
		LinkedList<Entry<k,v>> bucket=buckets[index];
		
			for(Entry<k,v> entry:bucket)
			{
				if(entry.key.equals(key))
				{
				return entry.value;
				}
			}
			
			return null;
		}
		
	

	
	
	public void resize()
	{
		int newCapacity=capacity*2;
		
		LinkedList<Entry<k,v>>[] newBuckets=new LinkedList[newCapacity];
		
		for(int i=0;i<newCapacity;i++)
		{
		     newBuckets[i]=new LinkedList<>();
		}
		
	     for(int i=0;i<capacity;i++)
	     {
	    	 
	    	 for(Entry<k,v> entry:buckets[i])
	    	 {
	    		 int newIndex=Math.abs(entry.key.hashCode())%newCapacity;
	    		 
	    		 newBuckets[newIndex].add(new Entry<>(entry.key,entry.value));
	    	 }
	     }
	     
	     buckets=newBuckets;
	     capacity=newCapacity;
	}
	
	
	public static void main(String... args)
	{
		CustomHashMap<String, String> map = new CustomHashMap<>(4); // Smaller initial capacity for testing resizing

        System.out.println(map.size +" "+"initialsize");
        
        map.put("ram","india");
        map.put("dinesh","india");
        map.put("koteswar", "china");
        map.put("ramesh", "pakistan");

        
        System.out.println(map.size +" "+"after adding four");
        // Should trigger resize when inserting the 5th element
        map.put("raju", "bhimarvaram");

        System.out.println("Value for 'koteswar': " + map.get("koteswar"));  
        System.out.println("Value for 'ram': " + map.get("ram"));  // Output: 2
        System.out.println("Value for 'ramesh': " + map.get("ramesh"));  // Output: 5

        System.out.println("Current size: " + map.size);  // Output: 5
		
	}
	

	

}
