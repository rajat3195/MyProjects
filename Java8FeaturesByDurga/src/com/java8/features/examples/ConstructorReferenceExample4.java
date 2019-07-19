package com.java8.features.examples;

class Stud {
	String name;
	int rollno;
	int marks;
	int age;

	public Stud(String name, int rollno, int marks, int age) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.age = age;
		System.out.println("Name:" + name + ", Rollno:" + rollno + ", Marks:" + marks + ", Age:" + age);
	}
}

interface Interface6 {
	public Stud get(String name, int rollno, int marks, int age);
}

//old way
//class Demo implements Interface6 {
//	@Override
//	public Stud get(String name, int rollno, int marks, int age) {
//		Stud s = new Stud(name, rollno, marks, age);
//		return s;
//	}
//}

public class ConstructorReferenceExample4 {
	public static void main(String[] args) {
		Interface6 i1 = (name, rollno, marks, age) -> new Stud(name, rollno, marks, age);
		i1.get("Durga", 101, 82, 42);

		Interface6 i2 = Stud::new;
		Stud s = i2.get("Rajat", 102, 71, 24);

	}
}
