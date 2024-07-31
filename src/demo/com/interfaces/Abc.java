package demo.com.interfaces;

public interface Abc {
	
	default void add() {
		System.out.println("Addition");
	}

}
