package Java8;

import java.util.Arrays;
import java.util.List;

class Util{
	public static void greet(String name) {
		System.out.println("Hello "+name);
	}
}
public class StaticMethodRef {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John","Jane");
		names.forEach(Util::greet);
	
	}

}
