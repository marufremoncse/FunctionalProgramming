package finalPackage;

import java.util.function.Function;

public class Lambdas {
	public static void main(String[] args) {
		Function<String, String> nameUpperCase = name -> {
			if(name.isBlank()) throw new IllegalArgumentException();
			return name.toUpperCase();
		};
		
		System.out.println(nameUpperCase.apply("raeraa"));
		
	}
}
