package NextPermutation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutationusingList {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(3,2,1,5,4);
		System.out.println("Original permutation: " + nums);
		List<Integer> nextPerm = nextPermutation(nums);
		System.out.println("Next permutation: " + nextPerm);

	}

	public static List<Integer> nextPermutation(List<Integer> nums) {

		int n = nums.size();
		if (n < 2) {
			return nums;
		}

		// Step 1: Find the largest index `i` such that nums[i] < nums[i + 1]
		int i = n - 2;

		while (i >= 0 && nums.get(i) >= nums.get(i + 1)) {
			i--;
		}

		// If no such index exists, this is the last permutation, return the first
		// permutation

		if (i >= 0) {
			int j = n - 1;
			while (nums.get(j) <= nums.get(i)) {
				j--;
			}
			Collections.swap(nums, i, j);
		}

		reverse(nums, i + 1, n - 1);

		return nums;
	}
	
	
	private static void reverse(List<Integer>nums, int start, int end) {
		while(start<end) {
			Collections.swap(nums, start, end);
			start++;
			end--;
		}
	}

}
