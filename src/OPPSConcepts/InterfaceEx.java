package OPPSConcepts;

@FunctionalInterface
interface Calculator{
	int add(int a, int b);
}

public class InterfaceEx {

	public static void main(String[] args) {
		
		Calculator sum = (a,b)-> a+b;
		
		System.out.println(sum.add(3, 2)); 

	}

}
