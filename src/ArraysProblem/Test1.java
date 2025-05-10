package ArraysProblem;




public class Test1 {

	public static void main(String[] args) {
		
		 int[] num = {2,3,4,23,54};
	       System.out.println(findSecondlargest(num));

	}
	
	  public static int findSecondlargest(int[] arr){
	        
	        int largest = Integer.MIN_VALUE;
	        int secondlargst = Integer.MIN_VALUE;
	        
	        for(int num : arr){
	            if(num > largest){
	                secondlargst = largest;
	                largest = num;
	            } else if(num>secondlargst){
	                
	                secondlargst = num;
	                
	            }
	        }
	        return largest;
	        
	    }

}
