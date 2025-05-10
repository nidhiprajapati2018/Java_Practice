package StringProgram;

/* 1.Find First Non-Repeated Character: Write a function to find the first non-repeated character in a string.
2. Palindrome Check : Write a function to check if a string is a palindrome while ignoring spaces and non-alphanumeric characters.
3. String Rotation: Write a function to determine if one string is a rotation of another string.
4. Reverse Words in a String: Write a function to reverse the order of words in a given string.

*/



public class StringAssignment {

	public static void main(String[] args) {
		String str = "ABCBACAH";
		String rstr = "";
		firstNonRepeatedCharacter(str);
		System.out.println(isPalindrome("A man, a plan, acanal: Panama"));
		System.out.println(isRotation("abcdef", "edfabc"));
		reverseWord2("JavaTraining");
		
		for(int i=0; i<str.length(); i++) {
			rstr = str.charAt(i)+ rstr;
		}
		
		System.out.println(rstr);
		
		if(str.equals(rstr)) {
			
		}
	}
	
	public static void firstNonRepeatedCharacter(String str) {
		for(int i = 0; i<str.length(); i++ ) {
			boolean unique = true;
			for(int j = 0; j<str.length(); j++) {
				if(i!=j && str.charAt(i)== str.charAt(j)) {
					unique = false;
					break;
				}
			}
			
			if(unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
	
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		StringBuilder b = new StringBuilder();
		
		for(int i = 0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
				b.append(s.charAt(i));
			}
		}
		
		//System.out.println(b);
		int n = b.length()-1;
		for(int i = 0; i<b.length()/2; i++) {
			if(b.charAt(i) != b.charAt(n-i))return false;
		}
		return true;
		
	}
	
	public static boolean isRotation(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		String concatenated = str1 + str1;
		System.out.println(concatenated);
		return concatenated.contains(str2);
	}
	
	public static void reverseWord(String input) {
		int n = input.length()-1; 
		for(int i = n; i>=0; i--) {
			System.out.print(input.charAt(i));
		}
	}
	
	public static void reverseWord2(String input) {
		char[] inputArr = input.toCharArray();
		int n = inputArr.length - 1; 
		for(int i = 0; i<= n/2; i++) {
			char tmp = input.charAt(i);
			char tmp2 = input.charAt(n-i);
			inputArr[i] = tmp2;
			inputArr[n-i] = tmp;
			//System.out.print(input.charAt(i));
		}
		System.out.println("TEST:");
		System.out.println(inputArr);
	}
	

}
