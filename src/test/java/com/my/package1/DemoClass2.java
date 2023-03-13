package com.my.package1;

public class DemoClass2 {

	public static void main(String[] args) {
		int maths = 70;
		int social = 60;
		int english = 55;
		int physics  = 80;
		int total = maths + social+ english+physics; //int + int --> int
		System.out.println(total);
		System.out.println("Avg "+total/4); 
		
		String firstName = "John";
		String lastName = "Legend";
		System.out.println(firstName+lastName);
		
		System.out.println(firstName+lastName+total); //String + int--> String
	}

}
