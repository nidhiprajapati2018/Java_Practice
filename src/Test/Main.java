package Test;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
		    if (i == 3) {
		        break; // Exit the loop when i is 3
		    }
		    System.out.println("Iteration: " + i);
		}
		
		
		for (int j = 1; j <= 5; j++) {
		    if (j == 3) {
		        continue; // Skip iteration when j is 3
		    }
		    System.out.println("Iteration: " + j);
		}



	}

}
