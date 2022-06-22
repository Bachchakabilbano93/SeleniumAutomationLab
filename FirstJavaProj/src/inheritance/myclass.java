package inheritance;

public class myclass {
	
	int a;
	int b;
	
	public myclass() {
		System.out.println("Call to constructor");
	}
	
	public myclass(int a) {
//		a = a;
		this.a = a;
	}
	
	public void printA() {
		System.out.println("Value of a is "+a);
	}

}
