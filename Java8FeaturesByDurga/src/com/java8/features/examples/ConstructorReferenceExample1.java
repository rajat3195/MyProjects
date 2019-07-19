package com.java8.features.examples;

class Sample {
	Sample() {
		System.out.println("Sample class Constructor Execution...");
	}
}

interface Interface3 {
	public Sample get();
}

public class ConstructorReferenceExample1 {

	public static void main(String[] args) {
		Interface3 i = Sample::new;
		Sample s1 = i.get();
		Sample s2 = i.get();
		Sample s3 = i.get();
		Sample s4 = i.get();

	}

}
