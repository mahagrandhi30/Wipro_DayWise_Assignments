package Java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefExample {

	public static void main(String[] args) {
		List<String> empList = Arrays.asList("David","Alice","Bob");
		
		System.out.println("Lambda Expression");
		empList.forEach(name -> System.out.println(name));
		
		System.out.println("\nMethod Reference");
		empList.forEach(System.out::println);
	}

}
