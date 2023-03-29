package com.oops;

//class is called a blue print
//class contains member functions and data members
public class ClassDemo {
	
	//class level variables or Data members
	String empName = "John Legened" ; //Creating a new var and assigning value to it
	int empId  = 1122; //Creating a new var and assigning value to it , 0
	boolean empMaritalStatus; //Just declared a boolean variable
	//default value for boolean data type is false

	public static void main(String[] abc) {
		ClassDemo myClassObj = new ClassDemo(); // standard expression to create a class object
		myClassObj.displayEmpName();
		myClassObj.displayEmpId();
		
		System.out.println(myClassObj.empName);
		System.out.println(myClassObj.empId);
		//if you dont assign a value but triews to print that var, then it prints default value
		System.out.println(myClassObj.empMaritalStatus);
	}
	
	//Declaring a non-static method or member function
	public void displayEmpName() {
		System.out.println(empName);
	}
	
	//Declaring a non-static method
	public void displayEmpId() {
		System.out.println(empId);
	}

}
