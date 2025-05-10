package Question5;

import java.util.Random;

public class Testcompartment {

	public static void main(String[] args) {
		
		Compartment array[]= new Compartment[5];
		Random random = new Random();
	
		int rand = 0;
//		
		for(int i=0; i<array.length; i++) {
			rand = random.nextInt(5);
			
			
			if(rand == 1) {
				array[i] =  new FirstClass();
				} else if(rand == 2) {
					
				
				array[i]= new Ladies();
						
			} else if(rand == 3) {
				
				array[i] =  new Luggage();
			} else {
				
				array[i] =new General();
			}
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i].notice().toString());
		}
		
		
	}
}
