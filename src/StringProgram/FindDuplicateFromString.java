package StringProgram;

import java.util.*;

public class FindDuplicateFromString {

	public static void main(String[] args) {
		String str = "tetert";
		printDups(str);

	}

	static void printDups2(String str) {

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Duplicate character in string are  " + ch[j]);
					break;
				}
			}

		}

	}

	static void printDups(String str) {
	    
		HashMap<Character, Integer> count = new HashMap<>();
		
		for(int i=0; i<str.length();i++) {
			
			if(count.containsKey(str.charAt(i))) {
			     count.put(str.charAt(i) , count.get(str.charAt(i))+1); 
			}
			      else {
			    	  count.put(str.charAt(i),1);
			      }
			      //increase the count of characters by 1 
			    
			}
		
		for (Map.Entry<Character,Integer> mapElement : count.entrySet()) {   //iterating through the unordered map 
		      if (mapElement.getValue() > 1)   //if the count of characters is greater than 1 then duplicate found
		        System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
		    }
		
		
		//other way to write for each loop
		 /*count.forEach((k,v)-> {
	    	   if(v>1)System.out.println(k+" count = "+ v);
	    	   });*/
		  
		}

	

	public static void checkDupliChar(String str) {
	      System.out.println("The string is: " + str);
	      char[] carray = str.toCharArray();
	      // sorting the character array
	      Arrays.sort(carray);
	      System.out.println("Duplicate Characters in the above string are: ");
	      // for loop to print duplicate character
	      for (int i = 0; i < carray.length - 1; i++) {
	         if (carray[i] == carray[i + 1]) {
	            System.out.println(carray[i]);
	            // loop to skip next occurrence of same character
	            while (i < carray.length - 1 && carray[i] == carray[i + 1]) {
	               i++;
	            }
	         }
	      }
	   }

  


}
