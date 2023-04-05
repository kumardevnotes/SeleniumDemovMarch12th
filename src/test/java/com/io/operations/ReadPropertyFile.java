package com.io.operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws Exception  {
	  String rootPath = System.getProperty("user.dir"); //this will give root folder name in your PC
	  
	  FileReader myFile = new FileReader(rootPath + "//src//test//resources//appData.properties");
	  Properties pros  = new Properties();
	  pros.load(myFile);
	  
	  System.out.println(pros.getProperty("appName"));
	  System.out.println(pros.getProperty("appUrl"));
	  System.out.println(pros.getProperty("appUserame"));
	  System.out.println(pros.getProperty("appPwd"));
	  
	  System.out.println(pros.getProperty("appLogPath"));
	  
	}

}
