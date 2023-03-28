package com.arrays.demo;

public class ArraysDemo {

	public static void main(String[] args) {
		int empId = 1122;
		
		empId =3344;
		System.out.println(empId);
		//Arrays store more than one value into a single array variable of same data type
		int empIds[] = {1122, 1123, 3344,4455,6677,1000,999 };
		              //0       1     2   3    4    5    6 == Array length()-1
		//Arrays are fixed in size one you declare and assign values to array as shown, 
		//then you can not add new values to array
		//this is a disadvantage in array
		double empSal[] = {1122.9900, 1123.99887, 3344,4455,6677,1000,999 };
		String empCities[]  = {"Hyd", "Pune", "Delhi"};
		
//		System.out.println(empIds[0]); //1122
//		System.out.println(empIds[1]); //1123
//		System.out.println(empIds[2]); 
//		System.out.println(empIds[3]); 
//		System.out.println(empIds[4]); 
//		System.out.println(empIds[5]); 
//		System.out.println(empIds[6]); //999
//		
		System.out.println(empCities[0]);
		System.out.println(empCities[1]);
		System.out.println(empCities[2]);
		
		// 0 
		for (int i = 0; i <= empIds.length-1; i++) { //1; 1 < 6
			System.out.println(empIds[i]); //1122 1123
		}
		//Below code will throw exception -- java.lang.ArrayIndexOutOfBoundsException
		//empIds[7] = 100;
	}

}
