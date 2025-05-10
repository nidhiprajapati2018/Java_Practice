package NextPermutation;

import java.util.*;
public class main {

	public static void main(String[] args) {
		
		 List<Integer>list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        
	        //reverse(list);
	        
	        int[] arr = {2,3,4,5,7};
	        
	        reverseArray(arr);
	        
	        

	        
	      }
	      
	      public static void reverse(List<Integer>list){
	           int i = 0;
	        int j = list.size()-1;
	        while(i<j){
	            Collections.swap(list,i,j);
	            i++;
	            j--;
	            
	        }
	        
	        System.out.println(list);
	     
		  
}
	      
	      public static void reverseArray(int[] num) {
	    	  
	    	 
		    
		       for(int i=0; i<= num.length/2; i++) {
		    	   int temp = num[i];
		    	   num[i]= num[num.length-1-i];
		    	   num[num.length-1-i] = temp;
		       }
		       
		      for(int i: num) { System.out.println(i);};
	    	  
	    	  
	      }
	
}


