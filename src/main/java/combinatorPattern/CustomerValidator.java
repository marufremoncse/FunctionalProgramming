package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidator {
	private boolean isEmailValid(String email) {
		return email.contains("@") && email.contains(".");
	}
	
	private boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("+880");
	}
	
	private boolean isAdult(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears()>=16;
	}
	
	public boolean isValid(Customer customer) {
		return isEmailValid(customer.getEmail()) && isPhoneNumberValid(customer.getPhoneNumber()) && isAdult(customer.getDob());
	}
}
