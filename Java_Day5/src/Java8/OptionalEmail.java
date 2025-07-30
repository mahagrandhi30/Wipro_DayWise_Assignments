package Java8;

import java.util.Optional;

public class OptionalEmail {

	public static void main(String[] args) {
		//Case1: Email is not present
		Optional<String> email1  = Optional.empty();
		String result1 = email1.orElse("default@example.com");
		System.out.println("Email (Not Present):"+result1);
		
		//Case1: Email is not present
		Optional<String> email2  = Optional.of("alice@example.com");
		String result2 = email2.orElse("default@example.com");
		System.out.println("Email (Present):"+result2);
		
		
	}

}
