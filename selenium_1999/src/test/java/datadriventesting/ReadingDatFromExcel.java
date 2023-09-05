package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilitity_file.exele_utility;

public class ReadingDatFromExcel {
	@Test(dataProvider = "shoper_exele",dataProviderClass = exele_utility.class)
	public void readingDataFrimExcel(String username,String password, String status) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");

		driver.findElement(By.id("FirstName")).sendKeys(username);

		driver.findElement(By.id("LastName")).sendKeys(password);

		driver.findElement(By.id("Email")).sendKeys(status);
		System.out.println(username);
		System.out.println(password);
		System.out.println(status);
	}
}
