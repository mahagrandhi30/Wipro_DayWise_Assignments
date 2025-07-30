package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	private String name;
	private int marks;
	public Student(String name,int marks) {
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
}

public class StreamExzmple {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Amit",80),
				new Student("Ravi",60),
				new Student("Meena",90),
				new Student("Sara",70)
				);
		
		List<String> topScores = students.stream()
				.filter(s->s.getMarks()>70)
				.sorted(Comparator.comparingInt(Student::getMarks).reversed())
				.map(Student::getName)
				.collect(Collectors.toList());
		System.out.println("Top Scores:"+ topScores);
	}
}
