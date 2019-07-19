package com.programs.functional;

interface A {
	void show();

	void display();
}

public class Test implements A {
	@Override
	public void show() {
		// TODO Auto-generated method stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	}
}

class B {
	void show() {
	}

	void display() {
	}
}

class Test2 extends B {
}
