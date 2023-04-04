package com.inheritance.demoII;

import com.inheritance.demo.TeacherClass;

public class StdClassC extends TeacherClass{ //2 + 4 -->6

	public static void main(String[] args) {
		StdClassC stdClassc  = new StdClassC(); //10kb * 1 = 10kb
		stdClassc.displayStdName();
		stdClassc.displayStdId(2233);
		
		stdClassc.displayExamDate();
		int testNum = stdClassc.getTestNumber();
		System.out.println(testNum);
		
		stdClassc.displaySchoolCalender();
		stdClassc.displaySchoolFee();
	}
	
	public void displayStdName() {
		System.out.println("San Jose");
	}
	
	public void displayStdId(int stdId) {
		System.out.println("Given Std Id: "+stdId);
	}

}
