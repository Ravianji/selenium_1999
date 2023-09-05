package datadriventesting;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class login {
	
	
	WebDriver driver;	
	//-----------------------------------------samekind of data---------------------------------------------
@Test	(dataProvider="datatest")
public void m1(String username,String password)
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.id("loginBtn")).click();
	driver.findElement(By.id("Email")).sendKeys(username);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	 boolean a1=driver.findElement(By.xpath("//div[@id='root']/descendant::div[5]/h3[text()='Ravi']")).isDisplayed();
	 
	 assertTrue(a1);
	 driver.quit();
			
}

  @DataProvider(name ="datatest")
  public Object[][] data()
{
Object data[][]=new Object[2][2];
data[0][0]="ravimahesh000777@gmail.com";
data[0][1]="Ravi@1234";
data[1][0]="ravimahesh@gmail.com";
data[1][1]="Ravi@1234";
return data;

} 
  
  //------------------------------------- multy damnation string array in parameter---------------------------------------
  @DataProvider(name="objstr")
  public String[][] m2()
  {
	  String[][]a1=new String[][] {
		  {"ravi","123"},
		  {"raki","456"},
		  {"rama","789"},
		  {"abcd","987"} };
		  
		  return a1;
	  }
  
  @Test(dataProvider = "objstr")
  public void takesdat(String []r)
  {
	  System.out.println(r[0]+">>>"+r[1]);
	  
  }
  
 //-----------------------------------object array in parameter and Indices data provider  ---------------------------------------------
  @DataProvider(name="objstr2")
  public Object[][] m3()
  {
	  Object[][]a1=new Object[][] {
		  {"ravi",123,"kumar"},
		  {"raki",456,"king","sriramapalli"},
		  {"rama",789,45.66},
		  {"abcd",987,true,007} };
		  
		  return a1;
	  }
  @Test(dataProvider = "objstr2")
  public void takesdat1(Object []r)
  {
	 
	  for (int i=0;i<r.length;i++)
	  {
		  System.out.println(r[i]);
	  }
	  
	  System.out.println("------------------------");
  }
  
//------------------------------------------------------------Single damnation array-----------------------------


@DataProvider(name="objstr3")
public Object[] m4()
{
	  Object[]a1=
		  {"ravi",4,'r',45.63,true};
		  return a1;
}

@Test(dataProvider = "objstr3")
public void single(Object r) {
	
	System.out.println(r);
}







}


