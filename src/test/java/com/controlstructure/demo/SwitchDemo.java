package com.controlstructure.demo;

public class SwitchDemo {

	public static void main(String[] args) {
		String city = "Hyd";
		switch(city) {
		case "Hyd":
			System.out.println("Hyd is my hometown");
			System.out.println("Hyd is my hometown");
			System.out.println("Hyd is my hometown");
			System.out.println("Hyd is my hometown");
			break;
		case "chennai":
			System.out.println("Chennai is my hometown");
			break;
		case "Pune":
			System.out.println("Pune is my hometown");
			break;
		default:
			System.out.println("Please enter other city name");
			break;
		}
		
		System.out.println("Outside switch");
	}

}
