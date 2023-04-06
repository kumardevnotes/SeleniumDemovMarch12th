package com.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//List is dynamic in size
		//List will store any type of data as an Object data type
		//List is ordered or index based
		//List accepts or store duplicate elements
		List empDetails = new ArrayList(); // ArrayList implements List
		
		empDetails.add("John Miller"); //0
		empDetails.add(1122); //1
		empDetails.add('M'); //2
		empDetails.add(50000.505060);//3
		empDetails.add(true); //4
		empDetails.add("Hyd"); //5
		empDetails.add("John Miller");
		empDetails.add("John Miller");
		
		empDetails.add(4, 7000);
		
		List empAddDetails = new ArrayList();
		empAddDetails.add("Infy");
		empAddDetails.add("Manager");
		
		empDetails.addAll(empAddDetails);
		
		System.out.println(empDetails);
		
		System.out.println(empDetails.get(3));
		
		//Advanced for loop
		for(Object obj : empDetails) {
			System.out.println(obj);
		}
		
		System.out.println(empDetails.contains("Mike Tyson")); //true/false
		empDetails.remove(0);
		empDetails.remove((Integer)1122);
		
		System.out.println(empDetails);
		
		if(empDetails.equals(empAddDetails)) {
			System.out.println("Both collection are same");
		}
		
		else{
			System.out.println("Both collections are not same");
		}
		
	}

}
