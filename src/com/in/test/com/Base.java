package com.in.test.com;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
{
	
	public static WebDriver driver;
	static Properties prop = new Properties();
	
	public static void launchBrowser()
	{
		
		try
		{System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		System.out.println("Browser Launch Successfully");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void windowmax()
	{
		driver.manage().window().maximize();
	}
	
	public static void actual()
	{
		driver.get("http://nemo-angler-staging.dev.cf.private.springer.com/login");
		driver.findElement(By.id("usernameId")).sendKeys("nso4579");
		driver.findElement(By.id("passwordId")).sendKeys("Pranali@2017");
		driver.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath(".//*[@id='navbar']/ul[1]/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='navbar']/ul[1]/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.id("searchInput")).sendKeys("13455244");
		driver.findElement(By.id("submit-btn")).click();
		driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr/td[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[3]/td[2]/a[1]")).click();
		String io = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[1]")).getText();
		String io1 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[2]")).getText();
		String io2 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[3]")).getText();
		String io3 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[4]")).getText();
		String io4 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[5]")).getText();
		String io5 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[6]")).getText();
		String io6 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[7]")).getText();
		String io7 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[8]")).getText();
		String io8 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[9]")).getText();
		String io9 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[10]")).getText();
		String io10 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[11]")).getText();
		
		System.out.println("startdate:"+io);
		System.out.println("stopdate:"+io1);
		System.out.println("user:"+io2);
		System.out.println("CMS course:"+io3);
		System.out.println("success:"+io4);
		System.out.println("scaled score:"+io5);
		System.out.println("credit:"+io6);
		System.out.println("Attemp num:"+io7);
		System.out.println("Ignore/Cause:"+io8);
		System.out.println("Reviable:"+io9);
		System.out.println("info:"+io10);
		driver.navigate().back();
	
	}
	
	
	public static void outcome()
	{
		driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[3]/td[2]/a[2]")).click();
		String io = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[1]")).getText();
		String io1 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[2]")).getText();
		String io2 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[3]")).getText();
		String io3 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[4]")).getText();
		String io4 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[5]")).getText();
		String io5 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[6]")).getText();
		String io6 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[7]")).getText();
		String io7 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[8]")).getText();
		String io8 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[9]")).getText();
		String io9 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[10]")).getText();
		String io10 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[11]")).getText();
		String io11 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[12]")).getText();
		String io12 = driver.findElement(By.xpath(".//*[@id='main']/table/tbody/tr[1]/td[13]")).getText();
		
		
		System.out.println("First Interaction:"+io);
		System.out.println("Last Interaction:"+io1);
		System.out.println("User:"+io2);
		System.out.println("Course and CMS ID:"+io3);
		System.out.println("Finished:"+io4);
		System.out.println("Success:"+io5);
		System.out.println("Restarted:"+io6);
		System.out.println("Attempt Count:"+io7);
		System.out.println("Credits:"+io8);
		System.out.println("Score %:"+io9);
		System.out.println("Reviewable:"+io10);
		System.out.println("Actions:"+io11);
		System.out.println("Net time in seconds %:"+io12);
		
		
		driver.quit();
	}
	
	
	
	
	public static void getURL()
	{
		
		try
		{
		driver.get(prop.getProperty("URL"));
		System.out.println("URL Entered");
		driver.findElement(By.className("personalisation__login")).click();
		System.out.println("Clicked on Login Button");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void getUsername() throws IOException
	{
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("Username"));
		//driver.get(prop.getProperty("Username"));
		System.out.println("Username Entered");
		getScreen();
	}
	
	
	
	public static void getPassword() throws IOException
	{
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("Password"));
		//driver.get(prop.getProperty("Password"));
		System.out.println("Password Entered");
		getScreen();
	}
	
	
	
	public static void LoginSubmit() throws IOException
	{
		driver.findElement(By.name("submit")).click();
		System.out.println("Login Page Submitted Successfully");
		getScreen();
	}
	
	
	
	public static void cmelink()
	{
		driver.findElement(By.xpath("//*[@class='main-navigation-teaser']/li[5]/a/span")).click();
		System.out.println("Clicked on CME Link");
	}
	
	
	
	public static void readData() throws IOException
	{
		try
		{
		File f1 = new File("../Testrunner/src/com/in/test/com/DataFile.properties");
		FileInputStream fileInput = null;

		fileInput = new FileInputStream(f1);

		prop.load(fileInput);
		
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("Username"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void myTab()
	{
		driver.findElement(By.className("personalisation__my-area")).click();
		System.out.println("Click on My Profile Tab");
	}
	
	
	public void Myprofile()
	{
		driver.findElement(By.xpath(".//*[@class='personalisation__my-area-menu active']/li[1]/a/span")).click();
		System.out.println("Inside Myprofile Page");
	}
	
	
	public void Mycmmi()
	{
		driver.findElement(By.xpath(".//*[@class='personalisation__my-area-menu active']/li[2]/a/span")).click();
		System.out.println("Inside CMMI Page");
	}
	
	
	public static void windowhandler() throws InterruptedException
	{

		String handle= driver.getWindowHandle();
		//System.out.println(handle);
		
        Set handles = driver.getWindowHandles();

        System.out.println(handles);
        for (String handle1 : driver.getWindowHandles()) 
        {

        	//System.out.println(handle1);

        	driver.switchTo().window(handle1);
        
    		
        }
        
      driver.close();
      driver.switchTo().window(handle);
       
        
	}
	
	
	public void Twitter() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;

		driver.findElement(By.xpath(".//*[@id='atftbx']/div/a/span[1]")).click();
		System.out.println("Follow us on twitter");
		windowhandler();
		
		
	}
	
	
	public void facebook() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath(".//*[@id='atstbx']/div/a[5]/span[2]")).click();
		System.out.println("Clicked on Facebook");
		windowhandler();
		
		
	}
	
	
	public void Googleshare() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='atstbx']/div/a[4]/span[2]")).click();
		System.out.println("Clciked on Google Share");
		windowhandler();
	}
	
	
	public void linkedin() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='atstbx']/div/a[2]/span[2]")).click();
		System.out.println("clicked on Linkedin");
		windowhandler();
	}
	
	
	public void Xing() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='atstbx']/div/a[1]/span[2]")).click();
		System.out.println("Clicked on Xing Icon");
		windowhandler();
	}
	
	
	public void twittericon() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='atstbx']/div/a[3]/span[2]")).click();
		System.out.println("Clciked on Twitter Icon");
		windowhandler();
		
	}
	
	
	public void shareEmail() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='atstbx']/div/a[6]/span[2]")).click();
		System.out.println("Clicked on share to Email");
		windowhandler();
	}
	
	
	public static void persoanlinfo()
	{
		String io = driver.findElement(By.xpath(".//*[@id='main']/div/div[1]/h3/span")).getText();
		if(io.equals("Persönliche Angaben"))
		{
			System.out.println("Persoanl Information Match");
		}
	}
	
	
	public static void passwordcheck()
	{
		String io = driver.findElement(By.xpath(".//*[@id='main']/div/div[2]/h3/span")).getText();
		if(io.equals("Mein Passwortn"))
		{
			System.out.println("Password Heading Match");
		}
	}
	
	
	
	public static void emailcheck()
	{
		String io = driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/h3/span")).getText();
		if(io.equals("Meine E-Mail"))
		{
			System.out.println("Email Address Match");
		}
	
	}
	
	
	public static void billaddress()
	{
		String io = driver.findElement(By.xpath(".//*[@id='main']/div/div[4]/h3/span")).getText();
		if(io.equals("Rechnungsanschrift"))
		{
			System.out.println("Bill Address Match");
		}
	
	}
	
	

	public static void Professionaladdress()
	{
		String io = driver.findElement(By.xpath(".//*[@id='main']/div/div[6]/h3/span")).getText();
		if(io.equals("Berufliche Daten"))
		{
			System.out.println("Professional Address Match");
		}
	
	}
	
	
	public static void Companydata()
	{
		String io = driver.findElement(By.xpath(".//*[@id='main']/div/div[6]/h3/span")).getText();
		if(io.equals("Berufliche Daten"))
		{
			System.out.println("Companydata Match");
		}
	
	}
	
	
	
	public static void Occupationproof()
	{
		String io = driver.findElement(By.xpath(".//*[@id='main']/div/div[7]/h3/span")).getText();
		if(io.equals("Berufsnachweis"))
		{
			System.out.println("Occupation proof Match");
		}
	
	}
	
	public static void screenshot()
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("screen/error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		
	}
	
	
	
	public static void getScreen() throws IOException
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//The below method will save the screen shot in d drive with name "screenshot.png"
		String timeStamp = new SimpleDateFormat("yyyy_MMdd_HHmmss").format(Calendar.getInstance().getTime());
		File screenShotName = new File("screen/"+timeStamp+".png");
		FileUtils.copyFile(scrFile, screenShotName);
		
	}
	
	
	public static void listallcourses()
	{
		//driver.get("http://nemo-core-staging-smed.dev.cf.private.springer.com/cme/6625940");
		driver.findElement(By.xpath(".//*[@id='main']/section[1]/div/div[1]/a/span[1]")).click();
		System.out.println("Clicked on list of all courses link");
	}
	
	
	public static void mycontent()
	{
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[1]/div/p/span")).click();
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[1]/div/div/ul/li/span/i")).click();
		System.out.println("Clicked on Mycontent");
	}
	
	public static void areaofexpertise()
	{
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[2]/div/p/span")).click();
		driver.findElement(By.xpath(".//*[@class='options']/li[13]/span/i")).click();
		System.out.println("Clciked on area of Expertise");
	}
	
	
	public static void subject()
	{
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[3]/div/p/span")).clear();
		driver.findElement(By.xpath("")).click();
	}
	
	
	public static void classified()
	{
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[3]/div/p/span")).click();
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[3]/div/div/ul/li/span/i")).click();
		System.out.println("Clciked on classified");
	}
	
	public static void Inthismagazine()
	{
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[4]/div/p/span")).click();
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[4]/div/div/ul/li/span/i")).click();
		System.out.println("Clciked on In this magazine");
	}
	
	
	public static void CourseStatus()
	{
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[5]/div/p/span")).click();
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[5]/div/div/ul/li[2]/span/i")).click();
		System.out.println("Clciked on CourseStatus");
	}
	
	
	public static void topicality() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[6]/div/p/span")).click();
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[6]/div/div/ul/li/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='from-date-input']")).sendKeys("2017-01-01");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='to-date-input']")).sendKeys("2017-11-20");
		
	}
	
	public static void closedatewindow()
	{
		driver.findElement(By.xpath(".//*[@class='remodal-close']")).click();
	}
	
	
	
	public static void todaydate()
	{
		driver.findElement(By.xpath(".//*[@class='remodal-confirm btn']")).click();
		System.out.println("Todays Date Selected");
	}
	
	
	public static void searchcme()
	{
		driver.get("http://nemo-core-staging-smed-preview.dev.cf.private.springer.com/learning/courses?q.query=&q.page=0&q.facets=true");
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[2]/div/p/span")).click();
		driver.findElement(By.xpath(".//*[@id='main']/section[2]/form/div/fieldset[2]/div/div/ul/li[1]/label")).click();
	}
	
	
	public static void courselink()
	{
		driver.findElement(By.xpath(".//*[@id='main']/section[3]/div[2]/section/div/a[2]/h3")).click();
		System.out.println("Course link clicked");
	}
	
	public static void startcourse() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='main']/div[2]/section/header/ul/li/a")).click();
		System.out.println("Course Started");
		windowhandler();
		
	}
	
	public static void anglurtest() throws InterruptedException
	{
		driver.findElement(By.id(".//*[@class='main']/section[3]/div[2]/section[1]/ul/li/a")).click();
		//driver.findElement(By.xpath(".//*[@id='main']/div[2]/section/header/ul/li/a")).click();
		//windowhandler();
		System.out.println("TRUE");
		
	}
	
	
	
	public static void bookmark()
	{
		driver.findElement(By.id(".//*[@class='personalisation__my-area-menu active']/li[3]/a/span")).click();
		myTab();
	}
	
	
	public static void newsletter()
	{
		driver.findElement(By.xpath(".//*[@class='personalisation__my-area-menu active']/li[4]/a/span")).click();
		myTab();
	}
	
	public static void subscription()
	{
		driver.findElement(By.xpath(".//*[@class='personalisation__my-area-menu active']/li[5]/a/span")).click();
		myTab();
	}
	
	public static void Mymembership()
	{
		driver.findElement(By.xpath(".//*[@class='personalisation__my-area-menu active']/li[6]/a/span")).click();
		myTab();
	}
	
	
	
}
	
	
	
	
	
	
