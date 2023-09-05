package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_ {
	
  @FindBy(name="user_name")
  private WebElement username ;
  
  @FindBy(name="user_password")
  private WebElement pass;
  
 @FindBy(id="submitButton")
 private WebElement enter_button;
 
 @FindBy(xpath="//span[text()=' Administrator']")
 private WebElement confirm;
 
 public Login_(WebDriver driver)
 {
	 PageFactory.initElements( driver,this);
 }


public void getenter_button() {
	enter_button.click();
}

public void setusername(String a)
{
	username.sendKeys(a);
}
public WebElement getusername()
{
	return username;
	}

public void setpass(String b)
{
	pass.sendKeys(b);
}
public WebElement getpass()
{
	return pass;
}

public WebElement getconfirm()
{
        return confirm;
}

}
