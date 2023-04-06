package com.arrays.demo;

public class DynamicDataInsertionArray {

	public static void main(String[] args) {
		//Declaring array with size
		
		//Disadvantages in Arrays
		//Can not store more than the size of the array
		//Memory is wasted if you do not store upto the max capacity of array
		//Can store only homogeneous data but not data with different data types
		//Accessing/removing/adding new values in array is tedious or complex
		int empIds[] = new int[5]; //{100, 200, 300, 400, 500}
		
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
