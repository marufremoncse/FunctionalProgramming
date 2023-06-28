package combinatorPattern;

import java.time.LocalDate;
import combinatorPattern.CustomerRegistrationValidator;
import combinatorPattern.CustomerRegistrationValidator.CustomerRegistrationStatus;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("Remon", "remon@gmail.com", "+8801932383889", LocalDate.parse("1995-12-12"));
		System.out.println(new CustomerValidator().isValid(customer));
		
		
		
		CustomerRegistrationStatus status = CustomerRegistrationValidator.isEmailValid().and(CustomerRegistrationValidator.isAdult()).and(CustomerRegistrationValidator.isAdult()).apply(customer);
		System.out.println(status);
	}
}
