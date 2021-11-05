package com.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Throwable  {
	
	
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Addactin_Project\\src\\main\\java\\com\\properties\\configuration.properties");
FileInputStream fis = new FileInputStream(f);
	 p = new Properties();
	p.load(fis);
	}
	
	public String getusername() {
String username = p.getProperty("username");
return username;
	}
	
	public String getpassword() {
String pass = p.getProperty("password");
return pass;
		
	}
	
	public String getcardnumber() {
String cardnum = p.getProperty("cardnumber");
return cardnum;
	}
	public String getcvv() {
String cvv = p.getProperty("ccvnumber");
return cvv;
	}

	public String getexpirymonth() {
		String expmonth = p.getProperty("expirymonth");
return expmonth;
	}
	
	
	public String getexpiryyear() {
		
String expyear = p.getProperty("expiryyear");
return expyear;
	}
	
	
	
	
}
