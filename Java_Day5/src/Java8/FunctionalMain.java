package Java8;

public class FunctionalMain {

	public static void main(String[] args) {
		myFunction f = () -> System.out.println("Doing Something...");
		f.doSomething();

	}

}
