package NumbersProgram;

/*Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1.
 It is guaranteed that there will be at most one pivot index for the given input.
 Example 1:

Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.

 */



public class PivotInteger {

	public static void main(String[] args) {
		System.out.println(pivotInteger2(8));

	}
	
	public static int pivotInteger(int n) {
        if(n==1) {
        	return 1;
        }
        
        int leftValue = 1;
        int rightValue = n;
        int sumLeft = leftValue;
        int sumRight = rightValue;
        
        while (leftValue<rightValue) {
        	if(sumLeft<sumRight) {
        		leftValue++;
        		sumLeft += leftValue;
        	}
        	else {
        		rightValue--;
        		sumRight += rightValue;
        	}
        	
        	if(sumLeft==sumRight && leftValue+1 == rightValue-1) {
        		return leftValue +1;
        	}
        }
        
        return -1;
        
    }
	
	public static int pivotInteger2(int n) {
		
		  int sum = n * (n + 1) / 2;

	        // Find the square root of the sum
	        int sqrtOfSum = (int) Math.sqrt(sum);
	      
	        // Check if the square of the square root equals the sum,
	        // which would mean the sum is a perfect square
	        if (sqrtOfSum * sqrtOfSum == sum) {
	            // If sum is a perfect square, the square root is our pivot integer x
	            return sqrtOfSum;
	        } else {
	            // If sum is not a perfect square, return -1
	            return -1;
	        }
		
	}
	
	

}
