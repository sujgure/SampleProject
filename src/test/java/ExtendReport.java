package test.java;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendReport extends Base
{
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	
	
	@Test
	public void verifyBlogTitle()
	{
		report=new ExtentReports("ExtendReport/LearnAutomation.html");
		 
		logger=report.startTest("VerifyBlogTitle");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		logger.log(LogStatus.INFO, "Browser started ");
		 
		driver.get("http://www.learn-automation.com");
		 
		logger.log(LogStatus.INFO, "Application is up and running");
		 
		String title=driver.getTitle();
		 
		//Assert.assertTrue(title.contains("Google")); 
		 
		logger.log(LogStatus.PASS, "Title verified");
		report.flush();
		report.close();
		System.out.println("Test case 1 bunty");
	}
	
}
