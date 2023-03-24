package com.controlstructure.demo;

public class IfElseDemoClass {

	public static void main(String[] args) {
		int empSalary = 20000;
		int empAge = 60;

		//if..true, this executes if block.. if false it will go to else
		
		//if is mandatory in if..else control structure
		//&& - AND operator used to check multiple conditions
		/*
		 * true && true --> true
		 * true && false --> false
		 * false && true --> false
		 * false && false --> false
		 * */
		if (empSalary > 25000 && empAge < 65) { // 20000 > 25000 --> false && true --> false
			System.out.println("You have to pay the tax");
		}

		//else is optional in if..else control structure
		else {
			System.out.println("You no need to pay the tax");
		}

	}

}
