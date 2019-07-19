package com.java8.features.examples;

// Old way to use
//class MyRunnable implements Runnable {
//	@Override
//	public void run() {
//		for (int i = 1; i <= 10; i++)
//			System.out.println("Child Thread - " + i);
//	}
//}
//
//public class LembdaExpExample3 {
//	public static void main(String[] args) {
//		 MyRunnable myRunnable = new MyRunnable();
//		 Thread thread = new Thread(myRunnable);
//		 thread.start();
//		 for (int i = 1; i <= 10; i++)
//		 System.out.println("Main Thread - " + i);
//
//	}
//}

// New way by lambda expression
public class LembdaExp3Threading {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 1; i <= 10; i++)
				System.out.println("Child Thread - " + i);
		};
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 1; i <= 10; i++)
			System.out.println("Main Thread - " + i);
	}
}
