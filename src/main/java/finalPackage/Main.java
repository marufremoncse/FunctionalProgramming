package finalPackage;

import java.io.Console;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		hello("Marufur", null, value -> System.out.println("Last name is not provided!!"));
		hello2("Marufur", null, () -> System.out.println("Last name is not provided!!"));
	}
	
	static void hello(String firstName, String lastName, Consumer<String> callback) {
		System.out.println(firstName);
		
		if(lastName!=null) {
			System.out.println(lastName);
		} else {
			callback.accept(firstName);
		}
	}
	
	static void hello2(String firstName, String lastName, Runnable callback) {
		System.out.println(firstName);
		
		if(lastName!=null) {
			System.out.println(lastName);
		} else {
			callback.run();
		}
	}

}
