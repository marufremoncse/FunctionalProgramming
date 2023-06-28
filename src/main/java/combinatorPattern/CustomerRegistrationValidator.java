package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import combinatorPattern.CustomerRegistrationValidator.CustomerRegistrationStatus;

public interface CustomerRegistrationValidator extends Function<Customer, CustomerRegistrationStatus>{
	
	static CustomerRegistrationValidator isEmailValid() {
		return customer -> customer.getEmail().contains("@") ? CustomerRegistrationStatus.SUCCESS : CustomerRegistrationStatus.MAIL_IS_NOT_VALID;
	}
	
	static CustomerRegistrationValidator isPhoneNumberValid() {
		return customer -> customer.getPhoneNumber().startsWith("+880") ? CustomerRegistrationStatus.SUCCESS : CustomerRegistrationStatus.PHONE_IS_NOT_VALID;
	}
	
	static CustomerRegistrationValidator isAdult() {
		return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears()>=16 ? CustomerRegistrationStatus.SUCCESS : CustomerRegistrationStatus.IS_NOT_ADULT;
	}
	
	default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
		return customer -> {
			CustomerRegistrationStatus status = this.apply(customer);
			return status.equals(CustomerRegistrationStatus.SUCCESS) ? other.apply(customer) : status;
		};
	}
	
	enum CustomerRegistrationStatus{
		SUCCESS, MAIL_IS_NOT_VALID, PHONE_IS_NOT_VALID, IS_NOT_ADULT
	}
}
