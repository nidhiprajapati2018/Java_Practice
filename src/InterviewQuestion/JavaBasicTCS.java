package InterviewQuestion;

/*Write an abstract class 'Bank':
. Write a static string called amount initialized to "INR".
. Write a private variable called rateOfInterest.
. Write a constructor to initialize rateOfInterest.
. Write setter and getter methods to set and return the value of rateOfInterest.
. Write two protected methods RepoRate and ReverseRepoRate.
Write a class 'JavaBasicTCS' which inherits the 'Bank' class:
. Set rateOfInterest value = 6
. Print rateOfInterest value*/


public class JavaBasicTCS extends Bank{
	
	

	public JavaBasicTCS(int rateOfInterest) {
		super(rateOfInterest);
		
	}
	
	

	public static void main(String[] args) {
		
		JavaBasicTCS tcs = new JavaBasicTCS(6);
		
		System.out.println(tcs.getReteOfInterest());

	}

}

abstract class Bank{
	static String  amount = "INR";
	private int rateOfInterest;
	
	public Bank(int rateOfInterest){
		this.rateOfInterest = rateOfInterest;
	}
	
	public void setRateOfInterest(int rateOfInterest){
		this.rateOfInterest= rateOfInterest;
	}
	
	public int getReteOfInterest() {
		return rateOfInterest;
	}
	
	protected void repoRate() {
		
	}
	
	protected void reverseRepoRate() {
		
	}
	
}
