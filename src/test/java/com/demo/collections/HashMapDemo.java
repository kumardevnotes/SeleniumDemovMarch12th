package com.demo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Generic collection is used to store data with the given data types as key and value
		Map<String, Integer> myStdDetails = new HashMap<String, Integer> (); //HashMap implements Map
		
		
		//If you assign a new value to an existing key, it will take the new value and ignores old value
		//Insertion order is not followed		
		myStdDetails.put("Ramesh" , 67);
		myStdDetails.put("Sam" , 56);
		myStdDetails.put("John" , 33);
		myStdDetails.put("Jim" , 67);
		myStdDetails.put("Mike" , 90);
		
		System.out.println(myStdDetails);
		
		for(Entry<String, Integer> stdDetails : myStdDetails.entrySet()) {
			if(stdDetails.getValue() >= 35) //33 >=35
				System.out.println(stdDetails.getKey()+" passed the exam");
			else
				System.out.println(stdDetails.getKey()+" failed in the exam");
		}
		
	}

}
