package ArraysProblem;

import java.util.Arrays;

public class MoveZeros {
	
	
	   public static void moveZerosToEnd(int[] arr) {
	        int index = 0;
	        
	        for (int num : arr) {
	            if (num != 0) {
	                arr[index] = num;  //arr[2]= 12
	               index++;
	            }
	        }
	        
	        while (index < arr.length) {
	            arr[index] = 0;  //arr[3]=0 , arr[4]=0
	            index++;
	        }
	    }

	public static void main(String[] args) {
		   int[] numbers = {0, 2, 0, 3, 12};
	        moveZerosToEnd(numbers);
	        System.out.println("After moving zeros: " + Arrays.toString(numbers));

	}

}
