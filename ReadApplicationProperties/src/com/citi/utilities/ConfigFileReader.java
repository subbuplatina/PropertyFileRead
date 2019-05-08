package com.citi.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	FileReader reader;
	private Properties properties;
	// hard code (Static code) application properties file location
	private final String propFilePath = "Resources//application.properties";

	public ConfigFileReader() {
		try {
			reader = new FileReader(propFilePath);
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propFilePath);
		}
	}
	
	public String getUserName() {
		String userName = properties.getProperty("user.name");
		if (userName != null) {
			return userName;
		}else {
			throw new RuntimeException("user.name not found in application.properties file");
		}
	}
	public String getApplicationUrl() {
		String url = properties.getProperty("app.url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("app.url not specified in the application.properties file.");
	}

}
