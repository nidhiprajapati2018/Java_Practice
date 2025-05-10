package ArraysProblem;

import java.util.HashSet;

public class ArrayIntersection {
	
	   public static void findIntersection(int[] arr1, int[] arr2) {
	        HashSet<Integer> set = new HashSet<>();
	        for (int num : arr1) {
	            set.add(num);
	        }

	        System.out.print("Intersection: ");
	        for (int num : arr2) {
	            if (set.contains(num)) {
	                System.out.print(num + " ");
	                set.remove(num);
	            }
	        }
	    }

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 2, 6, 7,3};
        findIntersection(arr1, arr2);

	}

}
