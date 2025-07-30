package Java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		Optional<String> name = getNameFromDB(false);
		
		name.ifPresentOrElse(
				n -> System.out.println("Name: "+n),
				() -> System.out.println("No name found"));

	}
	private static Optional<String> getNameFromDB(boolean namevalue){
		if(namevalue) {
			return Optional.of("John");
		}
		else {
			return Optional.empty();
		}
	}
}
