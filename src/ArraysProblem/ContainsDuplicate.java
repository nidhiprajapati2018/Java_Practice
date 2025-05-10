package ArraysProblem;

import java.util.*;
public class ContainsDuplicate {

	public static void main(String[] args) {
		
	    int[] num = {2,9,4,1,3,5,2};
	    //System.out.println("Contains Duplicate "+ isDuplicate(num));
	    
	    //addList(num);
	    
	    List<int[]> list1 = Arrays.asList(num);
	    System.out.println(Arrays.toString(list1));

	}
	
	public static boolean isDuplicate(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
	
	for(int num : arr) {
      if(set.add(num)== false) {
    	  return true;
      }
	   }
	   return false;
	   
	}
	
	public static void addList(int[] arr) {
	List<Integer> list = new ArrayList<>();
	
	for(int num: arr) {
		list.add(num);
	}
	System.out.println(Arrays.toString(arr));
	
	
	

	}
	
}



