package com.demo.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		//Set is dynamic in size
		//Set will store any type of data as an Object data type
		//Set is not ordered or not index based
		//Set does not accept or store duplicate elements
		Set empDetails = new HashSet(); // HashSet implements Set
		
		empDetails.add("John Miller"); 
		empDetails.add(1122);
		empDetails.add('M'); 
		empDetails.add(50000.505060);
		empDetails.add(true);
		empDetails.add("Hyd"); 
		empDetails.add("John Miller");
		empDetails.add("John Miller");
	
		
		System.out.println(empDetails);
		
		//empDetails.add(4, 7000);
		
		Set empAddDetails = new HashSet();
		empAddDetails.add("Infy");
		empAddDetails.add("Manager");
		
		empDetails.addAll(empAddDetails);
		
		System.out.println(empDetails);
		
		//System.out.println(empDetails.get(3));
		
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
		
		System.out.println(empDetails.size());
		
	}

}
