package StringProgram;

import java.util.Arrays;

public class STringAnagram {
	
	
	public static boolean isAnagram(String s1, String s2) {
		 
		if(s1.length()!=s2.length()) {
			return false;
		} else {
			
			
			char[] str1 = s1.toCharArray() ;
			Arrays.sort(str1);
		
			
			char[] str2 = s2.toCharArray();
			Arrays.sort(str2);
			System.out.println("ana");
			return Arrays.equals(str1, str2);//return boolean
			
			}
		
	     }
	

	public static void main(String[] args) {
		System.out.println (isAnagram("abc", "cba"));

	}

}
