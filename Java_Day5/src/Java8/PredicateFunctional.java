package Java8;

import java.util.function.Predicate;

public class PredicateFunctional {

	public static void main(String[] args) {
		Predicate<String> input = s->s.length()>5;
		System.out.println(input.test("Hello"));
		System.out.println(input.test("Welcome"));

	}

}
