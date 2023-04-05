package com.inheritance.demo;

//Child class or Subclass class
//Child class is extending parent class
//So child class can access the methods of Parent class and also its own methods
//multi level inheritence
public class StdClassA extends TeacherClass{ //2 + 4 -->6

	public static void main(String[] args) {
		StdClassA stdClassA  = new StdClassA(); //10kb * 1 = 10kb
		stdClassA.displayStdName();
		stdClassA.displayStdId(2233);
		
		stdClassA.displayExamDate();
		int testNum = stdClassA.getTestNumber();
		System.out.println(testNum);
		
		stdClassA.displaySchoolCalender();
		// Below method is private and will not be accessible outside
		//stdClassA.displaySchoolIncome();
		
		//Only subclass can access protected method in java as shown below
		stdClassA.displaySchoolFee();
	}
	
	//default access specifier. ONly within class you can use//call below methods
	void displayStdName() {
		System.out.println("San Jose");
	}
	
	void displayStdId(int stdId) {
		System.out.println("Given Std Id: "+stdId);
	}

}
