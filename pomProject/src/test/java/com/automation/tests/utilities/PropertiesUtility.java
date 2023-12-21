package com.automation.tests.utilities;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	private FileInputStream stream = null;
	private Properties propFile = null;
	public Properties createPropertyObject() {
		return new Properties();
	}
	
	public void loadFile(String filename,Properties properties) {
	
		String propertyFilePath=null;
		switch(filename) {
		case "applicationDataProperties":
			propertyFilePath=Constants.APPLICATION_PROPERTIES;
			break;
		default: System.out.println("no correct keyword entered");
			
		}
		try {
			stream=new FileInputStream(propertyFilePath);
			propFile.load(stream);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}

	public String getPropertyValue(String key) {
		String value = propFile.getProperty(key);
		return value;

	}

	public void writeDataToPropertyFile(File path, String key, String value) {

		Properties propFile = new Properties();
		propFile.setProperty(key, value);
		try {
			propFile.store(new FileOutputStream(path), "updating data");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getProperty(String string, Properties p) {
		// TODO Auto-generated method stub
		return null;
	}


}