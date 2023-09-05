package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organition 
{
	
	@FindBy(xpath="//td[@class='tabSelected']/a")
	private WebElement organisation1;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement creatorganition;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgname;
	
	
    
    public organition(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void  getorganisation()
	{
		 organisation1.click();
	}
	

}
