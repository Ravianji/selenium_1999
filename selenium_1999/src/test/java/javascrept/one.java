package javascrept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

import net.bytebuddy.asm.Advice.Argument;

public class one {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("am good man");
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement ravi=driver.findElement(By.xpath("//input[@id='email']"));
		 
		 js.executeScript("Arguments[o],value=Arguments[1]",ravi,"8050248522");
		 WebElement kumar=driver.findElement(By.xpath("//button[@name='login']"));
		 js.executeScript("Argument[0],click()",kumar);
		 
		
		
		
	}

}
