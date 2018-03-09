package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Acti_Page {
	public WebDriver driver;
	public Acti_Page(WebDriver driver)
	{
	      this.driver=driver;
	}
	
	public void verifyTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("title is matching");
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching");
			Assert.fail();
		}
	}
	
	public void verifyElementIsPresent(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is present");
		}
		catch(Exception e)
		{
			Reporter.log("element is not present");
			Assert.fail();
		}
	}


}
