package Optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Optional<String> mailOptional = Optional.ofNullable(null);
		
		mailOptional.ifPresentOrElse(mail->System.out.printf("%s mail is sent\n", mail), ()-> System.out.println("Mail is not provided"));

	}

}
