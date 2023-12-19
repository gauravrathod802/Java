package CollectionFramework.HashMap;// Java program to demonstrate iteration over
// Map using keySet() and values() methods 

import java.util.Map; 
import java.util.HashMap; 

class IterationDemo 
{ 
	public static void main(String[] arg) 
	{ 
		Map<Integer,String> gfg = new HashMap<Integer,String>();
	
		// enter name/url pair 
		gfg.put(1, "geeksforgeeks.org"); 
		gfg.put(2, "practice.geeksforgeeks.org"); 
		gfg.put(3, "code.geeksforgeeks.org"); 
		gfg.put(4, "www.geeksforgeeks.org"); 
		
		// using keySet() for iteration over keys 
		for (Integer name : gfg.keySet()) 
			System.out.println("key: " + name); 
		
		// using values() for iteration over values 
		for (String url : gfg.values()) 
			System.out.println("value: " + url); 
	} 
} 
