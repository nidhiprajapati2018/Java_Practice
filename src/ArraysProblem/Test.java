package ArraysProblem;

public class Test {
	
    public static void main(String[] args) {
    String str = "automation";
    
    StringBuilder sb = new StringBuilder(str);;
    String reversedStr = sb.reverse().toString();
    
    
    //String reversed = new StringBuilder(str).reverse().toString();
     System.out.println(reversedStr);
     
     if(str.equals(reversedStr)){
         System.out.println("palindrome");
     }
     else{
         System.out.println("Not palindrome");
     }
    
		/*
		 * if(isPalindrome(str)) { System.out.println("palindrome"); }else {
		 * System.out.println("Not palindrome"); }
		 */
	
	}
    
	
    
    
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
       String reverse =  sb.reverse().toString();
       
       return reverse;
        
          }
    
    public static boolean isPalindrome(String s) {
    	return reverse(s).equals(s);
    	
    }

}


