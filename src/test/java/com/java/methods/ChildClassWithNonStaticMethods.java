package com.java.methods;

public class ChildClassWithNonStaticMethods {

	public static void main(String[] args) {

		ChildClassWithNonStaticMethods obj = new ChildClassWithNonStaticMethods();
		// calling a static method
		obj.displayName();
		obj.displayName();
		obj.displayName();

		obj.displayName("Kumar");
		obj.displayName("Ranadheer");
		obj.displayName("Venu");
		
		obj.returnTaxPercentage(30000, "John");
		obj.returnTaxPercentage(21000, "Mike");
		obj.returnTaxPercentage(44000, "Sam");

		int sal = obj.getSalary();
		System.out.println(sal);

		double incentive = obj.getIncentive();
		System.out.println(incentive);

		boolean marStatus = obj.getMarStatus();
		System.out.println(marStatus);

	}

	public void returnTaxPercentage(int empSal, String empName) {
		if (empSal >= 25000) { //21000 >= 20000 --> false
			System.out.println(empName + " has to pay tax");
		} else {
			System.out.println(empName + " no need to pay tax");
		}
	}

	// Method overloading - method with same name but with diff params

	// Declaring a non-static method with static keyword
	public void displayName() { // No Param
		System.out.println("John MIller");
	}

	// Declaring a non-static method with static keyword
	public void displayName(String empName) { // String Param
		System.out.println(empName);
	}

	// Declaring a non-static method with return type int
	public int getSalary() {
		System.out.println("Returning a value");
		return 20000;
	}

	// Declaring a non-static method with return type int
	public double getIncentive() {
		return 2000.6080;
	}

	// Declaring a non-static method with return type int
	public boolean getMarStatus() {
		return true; // false
	}

}
