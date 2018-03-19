package com.in.test.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFile 
{

	
	public  Properties readData() throws IOException
	{
		File f1 = new File("../Testrunner/src/com/in/test/com/DataFile.properties");
		FileInputStream fileInput = null;

		fileInput = new FileInputStream(f1);

		Properties prop = new Properties();
		prop.load(fileInput);
		
		return prop;
		
		
		
	}
	
}
