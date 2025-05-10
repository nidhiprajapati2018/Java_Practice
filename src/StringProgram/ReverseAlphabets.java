package StringProgram;

public class ReverseAlphabets {

	public static void main(String[] args) {
		
		String input = "34auto35qa@sdet?25year^";
		char[] charArray = input.toCharArray();
		StringBuilder alphabetCollector = new StringBuilder();
		
		System.out.println("The Reverse String");
		
		for(char ch:charArray) {
		       if(Character.isAlphabetic(ch)) {
		    	   alphabetCollector.append(ch);
		       }else {
		    	   printReverseString(alphabetCollector);
		    	   System.out.print(ch);
		       }
		}
		
 	   printReverseString(alphabetCollector);

		
	}
	public static void printReverseString(StringBuilder alphabetCollector) {
		for(int i=alphabetCollector.length()-1;i>-1;i--) {
			System.out.print(alphabetCollector.charAt(i));
		}
		alphabetCollector.setLength(0);


	}

}
