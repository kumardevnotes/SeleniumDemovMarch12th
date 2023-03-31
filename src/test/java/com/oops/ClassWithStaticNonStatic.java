package com.oops;

public class ClassWithStaticNonStatic {

	//Instance variable
	int empSal = 30000;
	
	//class level variable
	static String empName = "John";

	public static void main(String[] args) {
		ClassWithStaticNonStatic obj  = new ClassWithStaticNonStatic();
		obj.displayEmpSalary();
		obj.displayEmpSalaryWithIncentive();
		System.out.println(obj.empSal); //32000
		obj.displayEmpSalary(20000);
		
		System.out.println(empName);
	}

	//Declaring a method without param
	public void displayEmpSalary() {
		System.out.println(empSal);
	}
	
	//Declaring a method with int param
	public void displayEmpSalary(int salaryGiven) {
		System.out.println("Salary given is: "+salaryGiven);
	}
	
	public void displayEmpSalaryWithIncentive() {
		empSal  = empSal + 2000; //30000+2000 --> empSal=32000
		System.out.println(empSal);
	}

}
