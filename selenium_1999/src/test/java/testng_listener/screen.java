package testng_listener;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/watch?v=LQ72KZAg0QE&list=PLacgMXFs7kl97cZzKPIc4VqLtcqVSs07j");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File org=ts.getScreenshotAs(OutputType.FILE);
		File copy=new File("./src/test/resources/ScreenShort/img4.jpeg");
		try {
			FileUtils.copyFile(org, copy);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the  end ");
		driver.quit();
		
	}

}
