package com.demo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemoWithGenerics {

	public static void main(String[] args) {
		Map myAppDetails = new HashMap(); //HashMap implements Map
		
		
		//If you assign a new value to an existing key, it will take the new value and ignores old value
		//Insertion order is not followed		
		myAppDetails.put("appName", "speaklanguages");
		myAppDetails.put("appUrl", "https://www.speaklanguages.com");
		myAppDetails.put("appUserame", "usertest1122");
		myAppDetails.put("appPwd", "pwd112233");
		myAppDetails.put("appEnv", "QA");
		myAppDetails.put("appBrowser", "Chrome");
		
		
		myAppDetails.put("appPwd", "updatedPwd8899");
		System.out.println(myAppDetails.entrySet());
		System.out.println(myAppDetails.keySet());
		System.out.println(myAppDetails.values());
		System.out.println(myAppDetails.get("appName"));
		System.out.println(myAppDetails.containsValue("usertest1122"));
		
		myAppDetails.remove("appBrowser");
		System.out.println(myAppDetails);
		
		//myAppDetails.clear();
		
		if(myAppDetails.isEmpty())
			System.out.println("Map collection is empty or no data available");
		else
			System.out.println("Map collection is not empty or data available");
	}

}
