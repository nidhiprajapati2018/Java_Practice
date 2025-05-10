package StringProgram;


class Example {
    protected void finalize() {
        System.out.println("Finalize method called");
    }
}

public class finalizeEx {

	public static void main(String[] args) {
		
		Example obj = new Example();
        obj = null;  // Making object eligible for garbage collection
        System.gc(); 
		

	}

}
