package com.inheritance.demo;

public class PrincipalClass { // 2

	public static void main(String[] args) {
		PrincipalClass principalClass = new PrincipalClass();
		principalClass.displaySchoolCalender();
		principalClass.displaySchoolIncome();
	}

	public void displaySchoolCalender() {
		System.out.println("https://www.officeholidays.com/subscribe/india");
	}

	// private access specifier
	private void displaySchoolIncome() {
		System.out.println(1000000);
		;
	}

	// protected access specifier
	//Below method is accessible within subclass or in the same package but it is not accessible in other packages
	protected void displaySchoolFee() {
		System.out.println(50000);
		;
	}
}
