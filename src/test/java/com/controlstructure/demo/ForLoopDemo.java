package com.controlstructure.demo;

public class ForLoopDemo {

	public static void main(String[] args) {
		//forloop control structure
		//forloop used to execute same statement n number of times based on some condition
		  //Declaration; condition;increment
		for (int i = 0; i < 5; i++) { //10;10<10
			System.out.println("hello All"); //3rd time hello All
		}
		
		System.out.println("I am Outside forloop");
		
		//Declaration; condition;decrement
		for (int i = 5; i > 0; i--) { //0; 0>0
			System.out.println("hello All"); //2nd time time hello All
		}
		
		System.out.println("I am Outside 2nd forloop");
		
		// print even numbers from 1 to upto 10 --> 2 4 6 8 10
		//continue is a keyword in java. it will skip the forloop 
		for (int i = 1; i <= 10; i++) { //4; 4<=10
			if(i==1 || i==3 || i==5 || i==7 || i==9) // false || false --> false
				continue;
			System.out.println(i); //2  4 6 8 10
		}
		
		System.out.println("I am Outside 3rd forloop");
		
	
				//break is a keyword in java. it will stop and quit the for loop
				for (int i = 1; i <= 10; i++) { //5;5<=10
					if(i==5) //5==5
						break;
					System.out.println(i);
				}
				
				System.out.println("I am Outside 4th forloop");
	
	}

}
