package com.nemo.TestPages.com;

import java.io.IOException;

import org.testng.annotations.Test;

import com.in.test.com.Base;

public class LoginTest extends Base
{
  
	
	@Test(priority=0)
	  public void f() 
	  {

		launchBrowser();
		System.out.println("Test case 1");
	  
	  }


	@Test(priority=1)
	public void f1() throws IOException 
	{
		readData();
		getURL();
		System.out.println("Test case 2");

	}

	
}
