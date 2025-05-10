package JavaTrickyQuestion;


class Parent {
    int x = 100;
    int getX() { return x; }
}

class Child extends Parent {
    int x = 200;
    @Override
    int getX() { return x; }
}

public class Test {
	
  public static void main(String[] ar) {
	
	  Parent pc = new Child();
	  System.out.println(pc.getX());
	  
	}

		}
