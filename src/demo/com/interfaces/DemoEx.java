package demo.com.interfaces;

public class DemoEx {
	
	public static void main(String[] args) {
		
		try {
			int i=100/0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			
			System.out.println(e);
		}
		
		System.out.println("Hello nani");
	}

}
