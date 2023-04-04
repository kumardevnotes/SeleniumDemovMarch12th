package com.inheritance.demo;

//final class can not be inherited. Nobody can extend final class
public class TeacherClassFinalKeywordDemo {
	
	//final var or field can not be asssgined with new value
	final int teacherId = 223344;
	
	//final keyword is used to provide restriction to the method to avoid overriding
	public final void dislayHighestMarks() {
		System.out.println(95);
		//you can not assign new value to final variable
		//teacherId = 22288282;
	}

	public void dislaySecondHighestMarks() {
		System.out.println(90);
	}

}
