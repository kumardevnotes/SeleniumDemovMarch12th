package com.dynamicdata.reading;

import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {

		Scanner scanObj = new Scanner(System.in);

		for (int i = 0; i < 2; i++) { //5 ; 5 <5
			System.out.println("Enter the empID");
			int empId = scanObj.nextInt(); // reads int value from keyboard
			System.out.println("You have entered empId: " + empId);
			
			System.out.println("Enter the empName");
			String empName = scanObj.next(); // reads int value from keyboard
			System.out.println("You have entered empName: " + empName);
			
			System.out.println("Enter the empSal");
			double empSalary = scanObj.nextDouble(); // reads int value from keyboard
			System.out.println("You have entered empSal: " + empSalary);
		}

	}

}
