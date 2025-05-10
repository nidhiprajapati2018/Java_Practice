package ArraysProblem;

public class SecondLargestFinder {

	public static void main(String[] args) {
		
		int[] number = {2,34,56,32,78};
		
		System.out.println("Second Largest "+findSecondLargest(number));
		

	}

	public static int findSecondLargest(int[] num) {
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int arr: num) {
			if(arr > largest) {
				secondLargest = largest;
				largest = arr;
			} else if(arr > secondLargest && arr != largest) {
				secondLargest = arr;
			}
		}
		
		return secondLargest;
	}

}
