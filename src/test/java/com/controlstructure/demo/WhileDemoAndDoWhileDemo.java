package com.controlstructure.demo;

public class WhileDemoAndDoWhileDemo {

	public static void main(String[] args) {
		int myNumber = 10;
		//While is used to execute same set of statements 'n' number of times
		//in While, condition is checked and if true then the statement is executed 
		while(myNumber > 0) { //0 > 0
			System.out.print(myNumber+"\t"); //10 9 8 7 6 5 4 3 2 1
			myNumber--; //8
		}
		System.out.println("I am ouside while loop now");
		
		int myNumber2 = 5;
		//DoWhile is used to execute same set of statements 'n' number of times
		//in DoWhile, statement is executed then at the end, condition is checked
		do { 
			System.out.print(myNumber2+" "); //5 4 3 2 1
			myNumber2--; //0
		}while(myNumber2 > 0); //0 >0
		System.out.println("I am ouside Dowhile loop now");
	}

}
