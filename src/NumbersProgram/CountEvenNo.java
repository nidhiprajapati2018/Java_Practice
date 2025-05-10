package NumbersProgram;

public class CountEvenNo {

	public static void main(String[] args) {
		countEven(123456789);

	}
	
	 public static void countEven(int num) {  
		  
		    int even=0;
		    int odd=0;
		    while(num>0){
		        int rem =  num%10;
		        if(rem%2==0){
		            even++;
		        }
		    else{
		        odd++;
		    }
		    num = num/10;
		        
		    }
		    
		    System.out.println("count of even "+ even);
		     System.out.println("count of odd "+ odd);
		}

}
