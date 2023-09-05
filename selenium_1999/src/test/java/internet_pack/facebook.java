package internet_pack;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilitity_file.Extendclass_of_screen;
import utilitity_file.baseclass;
//@Listeners(Extendclass_of_screen.class)
public class facebook extends baseclass {
	@Test(testName="login")
	public void firstpage()
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("xyzzzz");
		driver.findElement(By.id("pass")).sendKeys("maheshravi");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//div[@class='xds687c x1pi30zi x1e558r4 xixxii4 x13vifvy xzkaem6']/descendant::div[4]")).click();
		
	
	}
	

}
