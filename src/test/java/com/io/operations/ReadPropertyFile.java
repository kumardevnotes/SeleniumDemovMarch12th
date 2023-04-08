package com.io.operations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	//File IO means File input and Output operations

	public static void main(String[] args) throws IOException  {
	 
		String rootFolder = System.getProperty("user.dir"); //this will give root folder name in your PC
	  
	  FileReader myFile = new FileReader(rootFolder + "//src//test//resources//config.properties");
	  Properties pros  = new Properties();
	  pros.load(myFile);
	  
	  System.out.println(pros.getProperty("appName"));
	  System.out.println(pros.getProperty("appUrl"));
	  System.out.println(pros.getProperty("appUserame"));
	  System.out.println(pros.getProperty("appPwd"));
	  
	  System.out.println(pros.getProperty("appLogPath"));
	  
	}

}
