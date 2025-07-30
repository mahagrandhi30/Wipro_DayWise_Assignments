package Java8;

import java.util.function.Supplier;

public class SupplierFunctional {

	public static void main(String[] args) {
		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());
	}

}
