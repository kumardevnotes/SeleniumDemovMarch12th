package com.string.javadatatypes.demo;

public class DemoString {

	public static void main(String[] args) {
		//Declaration
		//String empCity ;
		//Assigning a value to a variable in Java
		String empCity = "NewDelhi"  ; //empCity[0]=N empCity[1]=e empCity[2]=w 
		//empCity[3]=D empCity[4]=e empCity[5]=l empCity[6]=h empCity[8-1]=i
		//length() --> 8
		System.out.println(empCity);
		
		System.out.println(empCity.toLowerCase());
		System.out.println(empCity.toUpperCase());
		System.out.println(empCity.equals("NewDelhi")); //true if value is equal, false if not equal
		System.out.println(empCity.equalsIgnoreCase(empCity)); //true
		System.out.println(empCity.charAt(2)); //w
		System.out.println(empCity.replace('e', 'X')); //NXwDXlhi
		System.out.println(empCity.endsWith("Delhi")); //true
		System.out.println(empCity.startsWith("Old")); //false
		System.out.println(empCity.isBlank()); //"    "
		System.out.println(empCity.isEmpty()); //""
		System.out.println(empCity.length());
		
		System.out.println(empCity.concat(" Hyderabad")); //NewDelhi Hyderabad
		
		System.out.println(empCity.substring(3)); //Delhi
		
		System.out.println(empCity.substring(3, 5)); //3, 4...
		
		System.out.println(empCity+100+200);
		System.out.println(100+200);
	}

}
