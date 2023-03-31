package com.oops;

public class ConstructorDemo {
	
	//A constructor is a method in java whose name is same as class name
	//You no need to call constructor the way you call normal java methods
	//create an object of your class then constructor is called or triggered automatically
	ConstructorDemo(){
		System.out.println("I am a default contructor");
	}
	
	//Param constructor
	ConstructorDemo(String message){
		System.out.println("I am a parameterized contructor: "+message);
	}


	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		obj.displayName();
		obj.displayID();
		
		ConstructorDemo obj1 = new ConstructorDemo("Hello All");
		obj1.displayName();
		obj1.displayID();
	}

	public void displayName() {
		System.out.println("John");
	}

	public void displayID() {
		System.out.println(112233);
	}

}
