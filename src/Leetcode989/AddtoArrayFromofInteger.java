package Leetcode989;
import java.util.*;

/*The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

 

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234*/


public class AddtoArrayFromofInteger {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,0}; //1230 + 34= 1264
		int k = 34;
	   
		System.out.println(addToArrayForm(num, k));
	}
	
 

	public static List<Integer> addToArrayForm(int[] num, int k) {
	
		List <Integer> re = new ArrayList<>();
	  
		int sum = 0;

        for(int i=0; i<num.length; i++){
        	
            sum = sum*10 + num[i];
        }
		
          
        sum = sum+k;
        System.out.println(sum); //1234
          
        while(sum>0){
            int rem = sum%10;
           
            re.add(rem);
           sum= sum/10;
          }
          Collections.reverse(re);
          return re;


    }

}
