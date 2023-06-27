package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	public static void main(String[] args) {
		System.out.println(incrementByOne(1));
		System.out.println(incrementByOneFunction.apply(1));
		System.out.println(multiplyByTenFunction.apply(2));
		System.out.println(cascadeFunction.apply(10));
		System.out.println(incrementByOneMultiplyByNumber.apply(10, 5));
		
	}
	
	static Function<Integer, Integer> incrementByOneFunction = number -> ++number;
	static Function<Integer, Integer> multiplyByTenFunction = number -> number*10;
	static Function<Integer, Integer> cascadeFunction = incrementByOneFunction.andThen(multiplyByTenFunction);
	static BiFunction<Integer, Integer, Integer> incrementByOneMultiplyByNumber = (number1, number2) -> ++number1 * number2;
	static int incrementByOne(int i) {
		return ++i;
	}
}
