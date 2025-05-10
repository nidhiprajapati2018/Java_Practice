package NumbersProgram;

public class SumEvenNumber {

	public static void main(String[] args) {
		String s = "12834000";
		int sum = 0;
		
		char ch[] = s.toCharArray();
		
	/*	for(char ch : s.toCharArray()) {
			int num = Character.getNumericValue(ch);
			//System.out.println(Character.getNumericValue(ch));
			if(num%2 == 0) {
				sum +=num;
			}
		}*/
		
		for(int i=0; i< ch.length;i++) {
			
		}
		
		System.out.println("The sum of even number inthe string is :"+ sum);
		//System.out.println(Character.getNumericValue(ch));

	}

}
