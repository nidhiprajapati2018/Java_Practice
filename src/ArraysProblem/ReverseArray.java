package ArraysProblem;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		  int[] num = {2,9,4,1,3,5};
		  reverse(num);
			/*
			 * for(int n:num) { System.out.print(n); }
			 */
		    System.out.println("Reversed Array : "+ Arrays.toString(num));

	}
	
	
	public static void reverse(int[] arr) {
		int left =0, right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

}
