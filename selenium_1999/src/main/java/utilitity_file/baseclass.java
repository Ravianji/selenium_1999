package utilitity_file;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseclass {
	public static WebDriver driver;
	public static String screen_Short_time;
	
	
	 @BeforeTest
	public void before_test()
	{

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
//	 @AfterMethod
//	 public void affter(ITestResult result)
//	 {
//		 screenshort(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".jpeg"));
//	 }
	 @AfterTest
	 public void clouse()
	 {
		 driver.close();
	 }
			
	}


