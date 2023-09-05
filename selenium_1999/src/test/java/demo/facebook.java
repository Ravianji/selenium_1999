package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class facebook {
	WebDriver driver;
	@Test(groups = {"system"})
  public void m1()
  {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("__disablenotification___");
	  driver=new ChromeDriver(option);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys("ma2");
	  driver.findElement(By.name("login")).click();
	    SoftAssert softassert=new SoftAssert();
	    String org="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
        String get=driver.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText();
        softassert.assertEquals(org,get);
	  
	 driver.quit();
	 softassert.assertAll();
	  
  }
	
	@Test(groups = {"unit"})
	public void login()
	{
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.id("email")).sendKeys("8050248522");
		  driver.findElement(By.id("pass")).sendKeys("maheshravi");
		  driver.findElement(By.name("login")).click();
		  driver.quit();
		  
	}
	@Test(groups = {"sanity","unit"})
	public void m2()
	{
		System.out.println("in m2 method ");
	}
	
	@Test(groups = {"weekly","sanit"},dependsOnGroups = {"unit"})
	public void m3()
	{
		System.out.println("in the method of m3 added// depend on group on unit which is not a groupd in unit");
	}

}
