package ArraysProblem;

import java.util.Arrays;
//Rotate an array K times to the right. 
public class RotateArray {
	
	  public static void rotate(int[] arr, int k) {
	        k = k % arr.length; // Handle cases where k > length
	        reverse(arr, 0, arr.length - 1);// complete reverse the string
	        reverse(arr, 0, k - 1); // initial two values is swap depend on k's value
	        reverse(arr, k, arr.length - 1);//last digit
	    }

	    private static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }

	public static void main(String[] args) {
	      int[] numbers = {1, 2, 3, 4, 5};
	        rotate(numbers, 2);
	        System.out.println("Rotated Array: " + Arrays.toString(numbers));

	}

}
