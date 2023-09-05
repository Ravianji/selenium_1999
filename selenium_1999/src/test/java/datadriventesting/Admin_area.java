package datadriventesting;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilitity_file.Extendclass_of_screen;
import utilitity_file.admin;
import utilitity_file.baseclass;
@Listeners(Extendclass_of_screen.class)
public class Admin_area  extends baseclass{
	
	//@Test(dataProviderClass = admin.class,dataProvider = "Admin_area_demo",testName = "admin_login")
	@Test(dataProvider ="intheclass" )
	public void m1(String user,String pass,String status )
	{
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement a1= driver.findElement(By.xpath("//input[@id='Email']"));
		a1.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(user);
		a1.sendKeys(user);
		
		WebElement a2=driver.findElement(By.xpath("//input[@id='Password']"));
		a2.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pass);
		a2.sendKeys(pass);
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String Actual="John Smith";
		String got=driver.findElement(By.xpath("//a[@class='nav-link disabled']]")).getText();
		if(status.equals("valid")) {
			if(Actual.equals(got)) {
				System.out.println("1");
			}else {
				System.out.println("nop");
			}
		
		}else {
			System.out.println("wrong credentials");
		}

//		
//		if(status.equals("valid"))
//		{
//			String got=driver.findElement(By.xpath("//a[@class='nav-link disabled']]")).getText();
//			
//			if(Actual.equals(got)) 
//			{
//				System.out.println("1");
//				driver.findElement(By.xpath("//a[text()='Logout']")).click();
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			    Assert.assertTrue(true);
//			}
//			
//			else
//			{System.out.println("2");
//						 Assert.assertTrue(false);
//			}
//		}
//		
//		else if(status.equals("invalid"))
//		{
//			String goLt=driver.findElement(By.xpath("//a[@class='nav-link disabled']")).getText();
//			if(Actual.equals(got)) 
//			{   System.out.println("3");
//				driver.findElement(By.xpath("//a[text()='Logout']")).click();
//			    Assert.assertTrue(false);
//			}
//			
//			else
//			{
//				System.out.println("4");
//				 Assert.assertTrue(true);
//				
//			}
//			
//			
//		}
	}
	
	@DataProvider(name = "intheclass")
	public String[][] get_data()
	{
		String data[][]= {{"admin@yourstore.com","admin","valid"},
		                  {"admin@.com","admin","invalid"},
		                  {"admin@yourstore.com","ravi@123","invalid"},
		                  {"admin@baba","ravi@456","invalid"}
		                                                        };
		
		
		return data;
	}

}
