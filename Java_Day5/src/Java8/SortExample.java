package Java8;

import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

class Employee{
	String name;

	public Employee(String name) {
		this.name = name;
	}
}
//without lambda expression
//public class SortExample {
//
//	public static void main(String[] args) {
//		List<Employee> empList = Arrays.asList(
//				new Employee("David"),
//				new Employee("Alice"),
//				new Employee("Bob")
//				);
//		
//		Collections.sort(empList, new Comparator<Employee>() {
//			public int compare(Employee e1,Employee e2) {
//				return e1.name.compareTo(e2.name);
//			}
//		});
//		for(Employee e: empList)
//			System.out.println(e.name);
//	}
//
//}

//with lambda expression
public class SortExample{
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee("David"),
				new Employee("Alice"),
				new Employee("Bob")
				);
		empList.sort((e1,e2) -> e1.name.compareTo(e2.name));
		
		empList.forEach(e -> System.out.println(e.name));
	}
}


