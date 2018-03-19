package test.java;

import java.io.IOException;

public class TestRunner extends Base
{

	public static void main(String args[]) throws IOException
	{
		
		TestRunner io = new TestRunner();
		
		
		io.readData();
		io.launchBrowser();
		io.getURL();
		io.getUsername();
		io.getPassword();
		io.LoginSubmit();
		io.myTab();
		//io.Myprofile();
		io.Mycmmi();
		
		
		
	}
	
	
	
	
}
