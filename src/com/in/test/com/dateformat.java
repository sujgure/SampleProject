package com.in.test.com;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class dateformat 
{

	
	public static void main(String args[])
	{
		
		
		
		Calendar cal = Calendar.getInstance();
		System.out.println(new SimpleDateFormat("MMM").format(cal.getTime()));

		
	}
	
	
}
