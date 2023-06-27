package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
	public static void main(String[] args) {
		System.out.println(getDbConnectionString());
		System.out.println(getDbConnectionStringSupplier.get());
	}
	
	static String getDbConnectionString() {
		return "jdbc:mysql\\http:localhost:8080\\users";
	}
	
	static Supplier<List<String>> getDbConnectionStringSupplier = () -> List.of("jdbc:mysql\\http:localhost:8080\\users", "jdbc:mysql\\http:localhost:8081\\consumers");
}
