package com.java8.features.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample4 {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		long noOfFailedStudents = marks.stream().filter(i -> i <= 35).count();
		System.out.println("Number of Failed Students : " + noOfFailedStudents);
		List<Integer> failedStudentList = marks.stream().filter(i -> i < 35).collect(Collectors.toList());
		System.out.println("Failed Student list : " + failedStudentList);
	}
}
