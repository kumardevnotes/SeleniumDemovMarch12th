package com.arrays.demo;

public class DynamicDataInsertionArray {

	public static void main(String[] args) {
		//Declaring array with size
		int empIds[] = new int[5];
		
		System.out.println("Printing Array values before assigning the actual valaues");
		for (int i = 0; i <= empIds.length-1; i++) { //1; 1 < 5
			System.out.println(empIds[i]);
		}
		
		System.out.println("Inserting values into Array");
		for (int i = 0; i <= empIds.length-1; i++) { //1; 1 < 5
			empIds[i] = 100+i; // empIds[2] = 102
		}
		
		System.out.println("Printing Array values");
		for (int i = 0; i <= empIds.length-1; i++) { //1; 1 < 5
			System.out.println(empIds[i]);
		}
		
		System.out.println("Printing Array values in reverse");
		for (int i = empIds.length-1; i >=0; i--) {
			System.out.println(empIds[i]);
		}
	}

}
