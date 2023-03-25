package com.controlstructure.demo;

public class MultipleIfElseDemo {

	public static void main(String[] args) {
		// int schoolFee --> digital payments, cash, cheque
		
		int empSalary = 60000;
		
		if (empSalary >= 25000 && empSalary <= 45000) {
			
			System.out.println("You have to pay 10% tax");
		}
		else if (empSalary > 45000) { // 20000 > 45000 --false
			System.out.println("You have to pay 20% tax");
		}
		
		else if (empSalary > 100000) { // 20000 > 45000 --false
			System.out.println("You have to pay 30% tax");
		}
		else {
			System.out.println("You no need to pay the tax");
		}
	}

}
