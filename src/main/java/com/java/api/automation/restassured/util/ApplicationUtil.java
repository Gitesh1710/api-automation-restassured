package com.java.api.automation.restassured.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationUtil {
	
	public static Properties getProperty() throws IOException {
		File file =  new File("src/main/resources/properties/dev.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}
	
	
}
