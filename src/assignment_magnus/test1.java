package assignment_magnus;

public class test1 {
	
public int count = 17;
	
	public void increment() {
		count++;
	}
	
	public void print() {
		System.out.println(count);
	}
	
	public static void main(String [] args) {
		test1 counter1 = new test1();
		test1 counter2 = new test1();
		
		counter1.increment();
		counter2.increment();
		
		counter1.print();
		counter2.print();
	}
	
}