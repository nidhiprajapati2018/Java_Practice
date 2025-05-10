package StringProgram;

public class PalindromAndReversedString {

	public static void main(String[] args) {
      
		String str = "madam";
		     
		 //reversedString(str);
		 //System.out.println(reversedString1(str));
		System.out.println(isPalindome2(str));
		     
		 }
		      
		 public static void  reversedString(String s){
			 
		          char[] arr = s.toCharArray();
		          for(int i=arr.length-1; i>=0; i--){
		              System.out.print(arr[i]);
		          }
		            System.out.println();
		     }
		          
		         
		 public static String reversedString1(String s){
		              String reversed ="";
		              for(int i=0; i<s.length(); i++){
		                  char ch = s.charAt(i);
		                  
		                  reversed = ch+ reversed;
		              }
		              
		              return reversed;
		     
		 }
		          
		          
		 public static boolean isPalindome(String s){
		              
			 String str = reversedString1(s);
		              
			 if(str.equals(s)){
		                  
				 return true;
		              
			 }
		              
			 return false;
		              
		 }
		          
		        
		 public static boolean isPalindome1(String s){
		             
			 String  reversed = "";
		         
			 for (int i= s.length()-1; i>=0; i--){
		            
				 reversed += s.charAt(i);
		          
			 }
		          
		          
			 return reversed.equals(s);
		          
		         
		 }
		         
		           
		 public static boolean isPalindome2(String s){
		             
		            
			 int start = 0;
		            
			 int end = s.length()-1;
		            
		           
			 while(start<end){
		                
				 if(s.charAt(start) != s.charAt(end)){;
		                
				 return false;
		            
				 }
				 start++;
		           
				 end--;
		            
			 }
		          
			 return true;
		          
		         
		 }
		          

}
