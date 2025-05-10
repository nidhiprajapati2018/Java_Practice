package JavaTrickyQuestion;

public class Question1 {
	
	public void sum(int a, int b) {
		System.out.println("int "+a+b);
	}
	
	public double  sum(int a, double b) {
		System.out.println(a+b);
		return a+b;
	}

	public static void main(String[] args) {
		
		Question1 q1  =  new Question1();
		
		q1.sum(10, 20.3);
		//System.out.println(q1.sum(10, 20));

	}

}
