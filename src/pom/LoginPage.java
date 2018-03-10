package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	@FindBy(xpath="//input[@id='username']")
	private WebElement untbox;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwdtbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	
	

}
