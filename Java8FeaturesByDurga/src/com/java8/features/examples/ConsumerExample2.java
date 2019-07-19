package com.java8.features.examples;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerExample2 {
	public static void main(String[] args) {

		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A[Dictintion]";
			else if (marks >= 60)
				grade = "B[First Class]";
			else if (marks >= 50)
				grade = "C[Second Class]";
			else if (marks >= 35)
				grade = "D[third Class]";
			else
				grade = "E[Failed]";
			return grade;
		};

		Predicate<Student> p = s -> s.marks >= 60;

		Consumer<Student> c = s -> {
			System.out.println("Student Name : " + s.name);
			System.out.println("Student Marks : " + s.marks);
			System.out.println("Student Grade : " + f.apply(s));
			System.out.println();
		};

		Student[] students = { new Student("Durga", 100), new Student("sunny", 65), new Student("Bunny", 55),
				new Student("chinny", 45), new Student("Vinny", 25) };

		for (Student s : students) {
			if (p.test(s))
				c.accept(s);
		}

	}
}
