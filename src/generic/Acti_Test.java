package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Acti_Test implements AutoConst {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE );
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do;jsessionid=10tr06k9b1itp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
	@AfterMethod
	public void closeAppln()
	{
		driver.quit();
	}

}
