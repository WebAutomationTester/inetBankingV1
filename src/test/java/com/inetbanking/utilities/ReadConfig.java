package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
	Properties pro;
	
	//Constructor
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			  FileInputStream fs = new FileInputStream(src);
			  pro = new Properties();
			  pro.load(fs);
			  
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is: "+e.getMessage());
		}
	}
	
	public String getApplication()
	{
		String url = pro.getProperty("baseURL1");
		return url;
	}
	
	public String getUsername()
	{
		String url = pro.getProperty("username");
		return url;
	}
	
	public String getPassword()
	{
		String url = pro.getProperty("password");
		return url;
	}
	
	public String getChromePath()
	{
		String url = pro.getProperty("chromepath");
		return url;
	}
}
