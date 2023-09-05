package datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilitity_file.exele_utility;

public class dataexecl {
	//dataProviderClass = exele_utility.class,dataProvider = "shoper_exele"
	@Test(dataProviderClass = exele_utility.class,dataProvider = "shoper_exele")
	public void login(String user,String pass,String states) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		WebElement a1=driver.findElement(By.id("Email"));
		a1.clear();
		a1.sendKeys(user);
		WebElement a2=driver.findElement(By.id("Password"));
		a2.clear();
		a2.sendKeys(pass);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(15000);
		String Expected="Hello, Ravi";
		String getting=driver.findElement(By.xpath("//a[@id='home']/parent::div/following::div[3]/h3")).getText();
		
		
		if(states=="valid") {
		driver.findElement(By.xpath("//a[@id='cart']/following-sibling::div/button")).click();
		driver.findElement(By.xpath("//div[@id='account-menu']//div[3]/ul/li[7]")).click();
		    if(Expected.equals(getting))
		    {
		     Assert.assertTrue(true);
		    }
		    
		    else
		    {
		    	Assert.assertTrue(false);
		    }
		}
		
		
		else if (states=="invalid")
		{
			  if(Expected.equals(getting))
			    {
					driver.findElement(By.xpath("//a[@id='cart']/following-sibling::div/button")).click();
					driver.findElement(By.xpath("//div[@id='account-menu']//div[3]/ul/li[7]")).click();
			     Assert.assertTrue(false);
			    }
			  else
			  {
					Assert.assertTrue(false);
			  }
			    
		}
			
			
		
		driver.quit();
	}

}
