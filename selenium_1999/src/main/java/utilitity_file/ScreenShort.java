package utilitity_file;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShort extends baseclass{
	
	
	
	public static  void screenshort(String result)
	{
		if(screen_Short_time == null)
		{
			LocalDateTime date=LocalDateTime.now();
			DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd-MM-yyyy-hh-mm-ss");
			screen_Short_time=date.format(formater);
			
		}
	TakesScreenshot ts=(TakesScreenshot)driver;
	File org=ts.getScreenshotAs(OutputType.FILE);
	File copy=new File("./src/test/resources/ScreenShort/"+screen_Short_time+"/"+result);
	try {
		FileUtils.copyFile(org, copy);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("screen short saved succuessfully");
	}

}
