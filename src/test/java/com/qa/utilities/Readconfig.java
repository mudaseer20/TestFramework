package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	Properties pro;
	
	public Readconfig() {
		File src=new File("./configuration/config.properties");
	
	
	try {
		
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}
	catch(Exception e) {
		System.out.println("exception is "+e.getMessage());
		
	}	}
	public String getappurl() {
		String url=pro.getProperty("url");
		return url;
	}
	public String getusername() {
	String username=pro.getProperty("username");
	return username;
	
	

}
	public String getpassword() {
		String username=pro.getProperty("password");
		return username;
	}
		public String getcustomername() {
			
			String customername=pro.getProperty("customername");
			return customername;
		
}}
