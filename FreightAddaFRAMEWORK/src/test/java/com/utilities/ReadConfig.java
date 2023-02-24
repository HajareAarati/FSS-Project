package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
Properties prop;
public ReadConfig() {

File src=new File("./Configuration\\config.properties");
	try {
		FileInputStream fis = new FileInputStream(src);
		prop=new Properties();
		prop.load(fis);
		
	} catch (Exception e) {
		
		System.out.println("Exception is"+e.getMessage());
	} 
}		
public String getApplicationURL() {
	String baseURL=prop.getProperty("baseURL");
	return baseURL;
}
			
public String getusername() {
	String username=prop.getProperty("username");
	return username;
}
public String getpassword() {
	String password=prop.getProperty("password");
	return password;
}
public String getchromePath() {
	String chromePath=prop.getProperty("chromePath");
	return chromePath;
}

		

}
