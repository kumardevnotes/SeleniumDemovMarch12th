package com.java.methods;

public class ChildClass {

	public static void main(String[] args) {
		// calling a static method
		displayName();
		int sal = getSalary();
		System.out.println(sal);
		
		double incentive = getIncentive();
		System.out.println(incentive);
		
		boolean marStatus = getMarStatus();
		System.out.println(marStatus);
		
	}

	// Declaring a static method with static keyword
	public static void displayName() {
		System.out.println("John MIller");
	}

	// Declaring a static method with return type int
	public static int getSalary() {
		System.out.println("Returning a value");
		return 20000;
	}

	// Declaring a static method with return type int
	public static double getIncentive() {
		return 2000.6080;
	}

	// Declaring a static method with return type int
	public static boolean getMarStatus() {
		return true; // false
	}

}
