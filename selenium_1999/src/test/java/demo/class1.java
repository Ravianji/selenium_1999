package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class1 {
@Test(groups = {"smoke","sanity"},priority = -1)
public void m1()
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("ravi",Keys.ENTER);
driver.quit();


}

@Test(priority = 1,groups = {"fungtion"})
public void m0()
{
	System.out.println("in the method 0");
	
}
}
