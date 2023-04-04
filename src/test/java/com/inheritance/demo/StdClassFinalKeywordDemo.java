package com.inheritance.demo;

public class StdClassFinalKeywordDemo extends TeacherClassFinalKeywordDemo {

	public static void main(String[] args) {
		StdClassFinalKeywordDemo obj = new StdClassFinalKeywordDemo();
		obj.dislayHighestMarks();
		
		//Runtime or dynamic polymorphism in java
		obj.dislaySecondHighestMarks();
	}
	
	//Overriding the parent class method
	public void dislaySecondHighestMarks() {
		System.out.println("Second highest marks: "+70);
	}


}
