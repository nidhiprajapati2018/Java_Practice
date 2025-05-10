package ArraysProblem;

public class Demo extends Test {
	
	String brand;
	int price;
	
	Demo(){
		this("toyote", 24000);
	}
	
	Demo(String brand, int price){
		//super();
		this.brand = brand;
		this.price = price;
	}
	
	public void displayall() {
		System.out.println(name +" "+ age+" "+ brand +" "+ price);
	}

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.displayall();
		
		
		/*
		 * public WebElement findSystemPercentage(String text){ return
		 * driver.findElement(By.xpath("//td[text()='"+text+
		 * "']//following-sibling::*[contains(text(),'%')]")); }
		 */
	}

}
