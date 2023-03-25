package com.controlstructure.demo;

public class IfElseDemoClassOrCondition {

	public static void main(String[] args) {
		int empSalary = 20000;
		int empAge = 60;

		// Last Login Date: 24-Mar-2023 or 25-Mar-2023
		//if (logiDate.equals(24-Mar-2023) || logiDate.equals(25-Mar-2023)) // false || true --> true
		
		if (empSalary > 25000 || empAge < 65) { 
			 // 20000 > 25000 ||60 < 65 --> false || true --> true
			System.out.println("You have to pay the tax");
		}

		//else is optional in if..else control structure
		else {
			System.out.println("You no need to pay the tax");
		}
				//|| - OR operator used to check multiple conditions
				/*
				 * true || true  --> true
				 * true || false --> true
				 * false || true --> true
				 * false || false --> false
				 * */

	}

}
