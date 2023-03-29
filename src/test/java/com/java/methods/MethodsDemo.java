package com.java.methods;

public class MethodsDemo {

	//static method
	public static void main(String[] args) {
		System.out.println("Hello All!");
		
		//calling  a method
		displayEmpName();
		displayEmpName("Mike Miller");
		
		displayEmpName();
		displayEmpName("Kumara Sangakkara");
		
		displayEmpSal(50000);
		displayEmpSal(20000);
		displayEmpSal(100000);
		displayEmpSal(5000);
		
		displayEmpName("Kumar", "Thoudi");
	}
	
	//method overloading in Java
	public static void displayEmpName() {
		System.out.println("John Legend");
	}
	
	public static void displayEmpName(String fullName) { //Mike Miller
		System.out.println(fullName); //Mike Miller
	}
	
	public static void displayEmpName(String firstName, String lastName) {
		System.out.println(firstName+lastName); 
		System.out.println(firstName); 
		System.out.println(lastName); 
	}
	
	
	public static void displayEmpSal(int empSal) {
		if(empSal > 30000) { // 20000 > 30000 --> false
			System.out.println("Emp has to pay the tax");
		}
		else {
			System.out.println("Emp no need to pay the tax");
		}
	}

}
