package com.ignitesol.reusablecomponents;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesSetup {
	
	public static String propertiesSetup(String key) {
		String value;
		FileInputStream fis;
		Properties p=new Properties();
		try {
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\configuration.properties");
		p.load(fis);
		}
		catch(Exception e) {
			
		}
		value=p.getProperty(key);
		
		return value;
	}

}
