package test.java;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.media.jfxmedia.logging.Logger;

public class POC extends Base 
{

	ExtentReports report;
	ExtentTest logger; 
	
	
	@Test(priority = 0)
	public void TestCase_0() 
	{
		report=new ExtentReports("ExtendReport/LearnAutomation.html");
		 
		logger=report.startTest("Launch Browser");
		
		launchBrowser();
		System.out.println("Test case 1");
		logger.log(LogStatus.PASS, "Browser Launch Successfully");
		

	}

	@Test(priority = 1)
	public void TestCase_1() throws IOException {
		logger=report.startTest("Enter URL In Browser ");
		
		readData();
		
		getURL();
		
		
		System.out.println("Test case 2");
		
		logger.log(LogStatus.PASS, "URL Entered Successfully");
		
	}

	@Test(priority = 2)
	public void TestCase_2() throws IOException {
		logger=report.startTest("Enter Username");
		getUsername();
		
		logger.log(LogStatus.PASS, "Username Entered");

		System.out.println("Test case 3");

	}

	@Test(priority = 3)
	public void TestCase_3() throws IOException {
		logger=report.startTest("Enter Password");
		getPassword();
		
		logger.log(LogStatus.PASS, "Password Entered");
		System.out.println("Test case 4");

	}

	@Test(priority = 4)
	public void TestCase_4() throws IOException 
	{
		logger=report.startTest("Click on Login Button");
		LoginSubmit();
		logger.log(LogStatus.PASS, "Clicked on Login Button");
		//logger.log(LogStatus.INFO, "Clicked on Submit Button");
		//logger.log(LogStatus.PASS, "Clicked on Submit Button");
		System.out.println("Test case 5");
		
		

	}
	
	

@Test(priority=5)
public void TestCase_5() throws IOException, InterruptedException 
{
	logger=report.startTest("Click on CME Link");
	cmelink();
	
	logger.log(LogStatus.PASS, "Clicked on CME Link");
	System.out.println("Test case 26");
	

}

@Test(priority=6)
public void TestCase_6() throws IOException, InterruptedException 
{
	logger=report.startTest("Click on List of All Courses");
	listallcourses();
	
	logger.log(LogStatus.PASS, "Clicked on List of all course");
	Responsive_startcourse();
	logger.log(LogStatus.INFO, "Clicked on Course Start Button");
	logger.log(LogStatus.PASS, "Clicked on List of all course");
	

	System.out.println("Test case 27");
	courseEnvoke();

}

@Test
public void checkTitle()
{
	logger=report.startTest("Check Title Of Page");
	String title = driver.getTitle();
    Assert.assertEquals("Home - Automation Test", title);
    logger.log(LogStatus.PASS, "Test Passed");
}

@Test
public void checkURL()
{
	logger=report.startTest("Check Url Of Page");
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "www.google.com");
	logger.log(LogStatus.PASS, "URL Match");
}


@AfterMethod
public void TearDowm(ITestResult result) throws IOException
{
	if(result.getStatus() == ITestResult.FAILURE)
	{
		 String screenShotPath = Base.capture();
		 System.out.println("Navnath :"+screenShotPath);
		 logger.log(LogStatus.FAIL, result.getThrowable());
		 logger.log(LogStatus.FAIL, "Snapshot below: " + logger.addScreenCapture(screenShotPath));
	}
	report.endTest(logger);
}




	
	@AfterClass
	public void TearDown()
	{
		report.flush();
	}
	

	
	
	
	// New Test cases Added

	
}
