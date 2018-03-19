package test.java;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNGLogin extends Base
{
 
	
@Test(priority=0)
  public void TestCase_0() 
  {
	launchBrowser();
	System.out.println("Test case 1");
  
  }


@Test(priority=1)
public void TestCase_1() throws IOException 
{
	readData();
	
	getURL();
	System.out.println("Test case 2");

}


@Test(priority=2)
public void TestCase_2() throws IOException 
{
	getUsername();
	
	System.out.println("Test case 3");

}



@Test(priority=3)
public void TestCase_3() throws IOException 
{
	getPassword();
	System.out.println("Test case 4");


}


@Test(priority=4)
public void TestCase_4() throws IOException 
{
	LoginSubmit();
	System.out.println("Test case 5");
	


}

/*
@Test(priority=5)
public void TestCase_5() throws IOException 
{
	myTab();
	System.out.println("Test case 6");


}

@Test(priority=6)
public void TestCase_6() throws IOException 
{
	Mycmmi();

	System.out.println("Test case 7");


}

@Test(enabled =false)
public void TestCase_7() throws IOException 
{
	Mycmmi();

	System.out.println("Test case 8");


}


@Test(priority=8)
public void TestCase_8() throws IOException, InterruptedException 
{
	Twitter();

	System.out.println("Test case 8");


}


@Test(priority=9)
public void TestCase_9() throws IOException, InterruptedException 
{
	facebook();

	System.out.println("Test case 9");


}

@Test(priority=10)
public void TestCase_10() throws IOException, InterruptedException 
{
	shareEmail();

	System.out.println("Test case 10");


}

@Test(priority=11)
public void TestCase_11() throws IOException 
{
	
	Xing();
	
	System.out.println("Test case 11");


}

@Test(priority=12)
public void TestCase_12() throws IOException, InterruptedException 
{
	linkedin();

	System.out.println("Test case 12");


}

@Test(priority=13)
public void TestCase_13() throws IOException 
{
	twittericon();

	System.out.println("Test case 13");


}

@Test(priority=14)
public void TestCase_14() throws IOException, InterruptedException 
{
	myTab();

	System.out.println("Test case 14");


}

@Test(priority=15)
public void TestCase_15() throws IOException, InterruptedException 
{
	Myprofile();

	System.out.println("Test case 15");


}

@Test(priority=16)
public void TestCase_16() throws IOException, InterruptedException 
{
	persoanlinfo();

	System.out.println("Test case 16");


}

@Test(priority=17)
public void TestCase_17() throws IOException, InterruptedException 
{
	passwordcheck();

	System.out.println("Test case 17");

}

@Test(priority=18)
public void TestCase_18() throws IOException, InterruptedException 
{
	emailcheck();

	System.out.println("Test case 18");

}

@Test(priority=19)
public void TestCase_19() throws IOException, InterruptedException 
{
	billaddress();

	System.out.println("Test case 19");

}

@Test(priority=20)
public void TestCase_20() throws IOException, InterruptedException 
{
	Professionaladdress();

	System.out.println("Test case 20");

}

@Test(priority=21)
public void TestCase_21() throws IOException, InterruptedException 
{
	Occupationproof();

	System.out.println("Test case 21");
	

}



@Test(priority=22)
public void TestCase_22() throws IOException, InterruptedException 
{
	myTab();
	bookmark();

	System.out.println("Test case 22");
	

}

@Test(priority=23)
public void TestCase_23() throws IOException, InterruptedException 
{
	myTab();
	newsletter();

	System.out.println("Test case 23");
	

}


@Test(priority=24)
public void TestCase_24() throws IOException, InterruptedException 
{
	myTab();
	subscription();

	System.out.println("Test case 24");
	

}


@Test(priority=25)
public void TestCase_25() throws IOException, InterruptedException 
{
	myTab();
	Mymembership();

	System.out.println("Test case 36");
	

}


*/










//New Test cases Added

@Test(priority=26)
public void TestCase_26() throws IOException, InterruptedException 
{
	
	cmelink();

	System.out.println("Test case 26");
	

}

@Test(priority=27)
public void TestCase_27() throws IOException, InterruptedException 
{
	listallcourses();
	Responsive_startcourse();
	

	System.out.println("Test case 27");
	

}

@Test(priority=28)
public void TestCase_28() throws IOException, InterruptedException 
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//mycontent();
	windowhandler();
	
	driver.switchTo().frame(0);
	int length = driver.findElements(By.id("iframe")).size();
	 System.out.println("Length of Iframe:"+length);
    String io = driver.getCurrentUrl();
    System.out.println("URL:"+io);
   String Title = driver.getTitle();
   System.out.println("Ttile:"+Title); 
   //driver.findElement(By.xpath(".//*[@id='next']")).click();
   
   driver.findElement(By.xpath("//a[@id='furtherinfoLinkd_quiz']")).click();

 int length1 = driver.findElements(By.tagName("iframe")).size();
 System.out.println("Length of Iframe:"+length1);
  
   
   
   
   WebDriverWait wait = new WebDriverWait(driver, 10);
   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@id='a_startQuiz']"))));
   System.out.println("xyz"+driver.findElement(By.xpath("//a[@id='a_startQuiz']")).getText());
   driver.findElement(By.xpath("//*[@id='a_startQuiz']")).click(); 
  
   for(int a=0;a<10;a++)
   { 
   driver.switchTo().frame(0);
   
  
   
   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[@id='questionText']"))));
   System.out.println("Question:"+driver.findElement(By.xpath(".//*[@id='questionText']")).getText());
     String question = driver.findElement(By.xpath(".//*[@id='questionText']")).getText();
   String answer = HashTable.readhashtable(question);
   System.out.println("answer::: "+answer);
   
   

   
 List<WebElement> links = driver.findElement(By.cssSelector("div #div_answerArea")).findElements(By.tagName("a"));
 System.out.println("Anchor Tag:"+links);

 System.out.println("Link Size:"+ links.size());

 
 for (int i =0; i<links.size(); i=i+1)
	 
	{
	    String answerId = links.get(i).findElement(By.cssSelector("div .choiceItem")).getAttribute("id");
	 	String answerText = links.get(i).getText();
	 	System.out.println("answerText::: "+answerText);
	 	System.out.println("answerId::: "+ links.get(i).findElement(By.cssSelector("div .choiceItem")).getAttribute("id"));
	 	if(answer.equalsIgnoreCase(answerText)){
	 		System.out.println("Provided click event for ID: " + answerId);
		 	links.get(i).findElement(By.cssSelector("div .choiceItem")).click();
		 }
	}
 try
 {
 driver.switchTo().defaultContent();
 
 //System.out.println("1st try CSS:"+driver.findElement(By.cssSelector("#nextQuestion")).getText());
 System.out.println("1st try Xpath:"+driver.findElement(By.xpath(".//*[@id='nextQuestion']")).getText());
   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[@id='nextQuestion']"))));
 }catch(Exception e){
	 System.out.println(e);
 }
 try
 {
	 driver.switchTo().frame(0);
	 
// System.out.println("CSS:"+driver.findElement(By.cssSelector("#nextQuestion")).getText());
 System.out.println("Xpath:"+driver.findElement(By.xpath(".//*[@id='nextQuestion']")).getText());
   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[@id='nextQuestion']"))));
 }catch(Exception e){
	 System.out.println(e);
 }
   
   
   
  // WebDriverWait waiti = new WebDriverWait(driver, 10);
  // waiti.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[@id='nextQuestion']"))));
   //System.out.println("NEXT"+driver.findElement(By.xpath(".//*[@id='nextQuestion']")).getText());
   
   
   
   
   
   
   
   
   /*driver.findElement(By.xpath(".//*[@id='nextQuestion']")).click();
   
String op = driver.findElement(By.xpath(".//*[@id='questionText']")).getText();
System.out.println("Question:"+op);*/
   
  
   
   //System.out.println("Question"+op);
   
   
   
   
 driver.findElement(By.xpath(".//*[@id='nextQuestion']")).click();
	System.out.println("Test case 28");
	

}
   
  try
  {
   
	  String qw = driver.findElement(By.xpath(".//*[@id='a_startQuiz']")).getText();
   String ff = driver.findElement(By.cssSelector(".startQuizButton quizButtonInner")).getText();
   
   System.out.println("Xpath Default:"+qw);
   System.out.println("CSS Default:"+ff);
  }
  catch(Exception e)
  {
	  e.printStackTrace();
  }
  
  
  
  
  
  
  
  
  
  
  
  
   
}
/*
@Test(priority=29)
public void TestCase_29() throws IOException, InterruptedException 
{
	CourseStatus();

	System.out.println("Test case 29");
	

}

@Test(priority=30)
public void TestCase_30() throws IOException, InterruptedException 
{
	topicality();

	System.out.println("Test case 30");
	

}

@Test(priority=31)
public void TestCase_31() throws IOException, InterruptedException 
{
	closedatewindow();

	System.out.println("Test case 31");
	

}

@Test(priority=32)
public void TestCase_32() throws IOException, InterruptedException 
{
	todaydate();

	System.out.println("Test case 32");
	

}

@Test(priority=33)
public void TestCase_33() throws IOException, InterruptedException 
{
	courselink();

	System.out.println("Test case 33");
	

}
@Test(priority=34)
public void TestCase_34() throws IOException, InterruptedException 
{
	startcourse();

	System.out.println("Test case 34");
	
}

@Test(priority=35)
public void TestCase_35() throws IOException, InterruptedException 
{
	actual();

	System.out.println("Test case 35");
	
}


@Test(priority=36)
public void TestCase_36() throws IOException, InterruptedException 
{
	outcome();

	System.out.println("Test case 36");
	quit();
	
}

*/






}
