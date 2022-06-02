package com.Dream11.myProject.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {

	public  String getDataFromPropertyFile(String Key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(IPathconstant.PROPERTY_FILE_PATH);
		Properties property = new Properties();
		property.load(fis);
		return property.getProperty(Key);
	}

}
