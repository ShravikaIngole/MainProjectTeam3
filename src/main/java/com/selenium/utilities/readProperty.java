package com.selenium.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readProperty {
	
	public static String getProperty(String locator) throws IOException {
		
		File file = new File(System.getProperty("user.dir") + "\\src\\main\\resources\\webLocators\\config.properties");
		FileInputStream fileInputStream;
		fileInputStream = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String property = properties.getProperty(locator);
		
		return property;
	}

}
