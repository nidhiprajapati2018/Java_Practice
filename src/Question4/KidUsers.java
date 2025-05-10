package Question4;

public  class KidUsers implements LibraryUser {
	public int age;
	public String bookType;
	
	public void registerAccount() {
		
		if(age < 12) {
			System.out.println("You have successfully registered under a kids Account ");
		}
		
	}

	public void requestBook() {
		
		
	}
	
	
}
