package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	public static void main(String[] args) {
		Customer customer = new Customer("Remon", "01932383889");
		greet(customer);
		greetV2(customer, false);
		greetConsumer.accept(customer);
		greetConsumerV2.accept(customer, false);
	}
	
	static class Customer{
		private String name;
		private String phoneNumber;
		
		public Customer(String name, String phoneNumber) {
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
	}
	
	static void greet(Customer customer) {
		System.out.printf("Hello %s, thanks for registering the phone number %s\n", customer.name, customer.phoneNumber);
	}
	
	static void greetV2(Customer customer, boolean bool) {
		System.out.printf("Hello %s, thanks for registering the phone number %s\n", customer.name, (bool ?  customer.phoneNumber : "******"));
	}
	
	static Consumer<Customer> greetConsumer = customer -> System.out.printf("Hello %s, thanks for registering the phone number %s\n", customer.name, customer.phoneNumber);
	static BiConsumer<Customer, Boolean> greetConsumerV2 = (customer, bool) -> System.out.printf("Hello %s, thanks for registering the phone number %s\n", customer.name, (bool ?  customer.phoneNumber : "******"));
}
