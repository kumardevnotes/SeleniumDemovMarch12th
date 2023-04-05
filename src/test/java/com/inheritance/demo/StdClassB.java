package com.inheritance.demo;

//Child class or Subclass class
public class StdClassB { // 2 + 2

	public static void main(String[] args) {
		StdClassB StdClassB = new StdClassB(); // 10kb * 1 = 10kb
		StdClassB.displayStdName();
		StdClassB.displayStdId(788);

		PrincipalClass pincipalClass = new PrincipalClass();
		pincipalClass.displaySchoolFee();

		// It will not be accessible as below method is private
		// pincipalClass.displaySchoolIncome();

	}

	public void displayStdName() {
		System.out.println("Mike Tyson");
	}

	public void displayStdId(int stdId) {
		System.out.println("Given Std Id: " + stdId);
	}

	/*
	 * multiple inheritence is not supported Java Reason: there are chnaces like
	 * parent classes may have same method and then it will be diffilut for the
	 * child class to invoke that method which will be a conflict
	 * 
	 * public class StdClassA extends TeacherClassII{ 
	 * StdClassA stdClassA =
	 * new StdClassA(); }
	 */

}
