package NumbersProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//System.out.println(fibonacci(4));
		fibonacciSeries(5);

	}
	
	public static int fibonacci(int n) {
		
		if(n<=1) {
			
			return n;
		}
		
		return (fibonacci(n-1)+fibonacci(n-2));
		
	}
	
	
	public static void fibonacciSeries(int n) {
		int n1=0;
		int n2=1;
		int n3= 0;
		System.out.print(n1 + " "+ n2);
		
		for(int i=0; i<=n; i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
		
		}
		
	}

}
