package com.inheritance.demoII;

import com.inheritance.demo.PrincipalClass;
import com.inheritance.demo.TeacherClass;

//Child class or Subclass class
public class StdClassD extends TeacherClass { //2 + 2

	public static void main(String[] args) {
		StdClassD StdClassB  = new StdClassD(); //10kb * 1 = 10kb
		StdClassB.displayStdName();
		StdClassB.displayStdId(788);
		
		PrincipalClass pincipalClass = new PrincipalClass();
		//not allowed 
		//pincipalClass.displaySchoolFee();
		
	}
	
	public void displayStdName() {
		System.out.println("Mike Tyson");
	}
	
	public void displayStdId(int stdId) {
		System.out.println("Given Std Id: "+stdId);
	}

}
