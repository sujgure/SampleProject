package com.in.test.com;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestNGLogin extends Base
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
