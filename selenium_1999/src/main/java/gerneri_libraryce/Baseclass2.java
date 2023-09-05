package gerneri_libraryce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import pom_class.Login_;

public class Baseclass2 implements All_class_location_string {
	public static WebDriver driver;
	public propertiesclass proprerty;
	public Login_ log;
	
	
	@BeforeClass
	public void beforeclass()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		proprerty=new propertiesclass();
		driver.get(proprerty.readingDataFromPropertFile("url"));
	    log=new Login_ (driver);
	    log.setusername(proprerty.readingDataFromPropertFile("user"));
	    log.getusername();
	    log.setpass(proprerty.readingDataFromPropertFile("pass"));
	    System.out.println(proprerty.readingDataFromPropertFile("pass"));
	    log.getpass();
	    log.getenter_button();
	    String text="Administrator";
	    String got=log.getconfirm().getText();
	    if(got.equals(got))
	    {
	    	Assert.assertTrue(true);
			}
	    else 
	    {
	    	Assert.assertTrue(false);
	    }
}
}
