package StringProgram;

public class RemoveCharacter {
	
	
    public static String removeChar(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }
	

	public static void main(String[] args) {
		  String input = "Selenium";
	        char removeChar = 'u';
	        System.out.println("After Removal: " + removeChar(input, removeChar));

	}

}
