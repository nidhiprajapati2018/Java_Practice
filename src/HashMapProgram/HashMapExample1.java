package HashMapProgram;

import java.util.*;
	import java.util.Map.Entry;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Mango");
		hm.put(2, "Apple");
		hm.put(3, "banana");
		hm.put(4, "banana");

		System.out.println(hm);

		// Methods in HashMap class

		System.out.println(hm.get(1)); // Mango // Using the get() method to retrieve a value from the HashMap
		System.out.println("The size of the HashMap is: " + hm.size()); // Printing the size of the HashMap

		  Set<Map.Entry<Integer, String>> entryset = hm.entrySet();
		System.out.println(entryset);

	     Set<Integer> keySet = hm.keySet();
		System.out.println(" Key value "+hm.keySet());

		Collection<String> value = hm.values();
		System.out.println(value);

		boolean containsKey = hm.containsKey(2);
		System.out.println("Contains Key 1? " + containsKey);

		boolean containsValue = hm.containsValue("banana");
		System.out.println("Contains Value 'banana'? " + containsValue);

		// Different way to iterate the hashmap

		// 1. Classic Iterator method
	
		  Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();
		  while(itr.hasNext()){
			  Map.Entry<Integer, String> entry = itr.next();
		        String keys = entry.getValue();		
		        System.out.println(entry.getKey()+ " | "+ entry.getValue()); 
		        }
	
	

		 //2. For each method

		
//		  for(Entry<Integer, String> en: hm.entrySet()) {
//		  
//		  System.out.println(en.getKey() +" | "+ en.getValue()); }
		 

		 //3. java 8 for each method

		hm.forEach((k,v) -> System.out.println(k+ " | "+ v));

		// Iterate through keys or values

		/*
		 * for(Integer set: hm.keySet()) { System.out.println(set); }
		 * 
		 * for(String value1: hm.values()) { System.out.println(value1); }
		 */

		// 5. Iterate through key, and get values

		for (Integer in : hm.keySet()) {
			System.out.println(in + "| " + hm.get(in));
		}
		
	
		
}	

	


}
