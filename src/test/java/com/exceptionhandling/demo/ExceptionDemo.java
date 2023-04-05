package com.exceptionhandling.demo;

public class ExceptionDemo {
	/*
	 * Throwable Exception
	 * 
	 * NullPointerException ArithmeticException FileNotFoundException IOExcpetion
	 * ArrayIndexOutOfBoundsException
	 */

	public static void main(String[] args) {
		System.out.println("Beginning of the main()");
//Exception handling using try..catch blocks
		try {

			String empName = "Kumar"; // nothing
			System.out.println("Given name Caps: " + empName.toUpperCase());

			int firstNum = 100;
			int secondNum = 10;
			System.out.println(firstNum / secondNum);
			
			//you created FOS
			//Open excel to write some data
		

		} catch (NullPointerException e) {
			System.out.println("Caught an excepption. Please check " + e);
		}

		catch (ArithmeticException e) {
			System.out.println("Caught an excepption. Please check " + e);
		}
		
		finally {
			//Close excel
			System.out.println("This will run with or without exception");
		}

		System.out.println("Ending of the main()");
	}

}
