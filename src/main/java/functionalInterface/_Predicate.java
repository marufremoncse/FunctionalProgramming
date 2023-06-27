package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
	public static void main(String[] args) {
		System.out.println("Without Predicate");
		System.out.println(isValidPhoneNumber("07018752189"));
		System.out.println(isValidPhoneNumber("07010002"));
		System.out.println(isValidPhoneNumber("09018752182"));
		System.out.println("Without Predicate");
		System.out.println(isValidNumberPredicate.test("07018752189"));
		System.out.println(isValidNumberPredicate.test("07010002"));
		System.out.println(isValidNumberPredicate.test("09018752182"));
		
		System.out.println(isValidNumberPredicate.or(doesContainThree).test("0701875189"));
	}
	
	public static boolean isValidPhoneNumber(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length()==11;
	}
	
	static Predicate<String> isValidNumberPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length()==11;
	static Predicate<String> doesContainThree = phoneNumber -> phoneNumber.contains("3");
}
