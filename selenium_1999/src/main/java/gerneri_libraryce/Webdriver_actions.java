package gerneri_libraryce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_actions extends Baseclass2 {
	
	public Select selectstatement(WebElement a) {
	
	Select s=new Select(a);
	
	return s;
	}
	
	public Select select_by_text(WebElement a,int b)
	{
		Select element=new Select(a);
		element.selectByIndex(b);
		return element;
		
	}
			
	
	
	

}
