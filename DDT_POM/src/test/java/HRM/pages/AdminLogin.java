package HRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AdminLogin {
	WebDriver driver;
	public AdminLogin(WebDriver driver)
	{
		this.driver= driver;
	}
//define Repository
	@FindBy(xpath = "//input[@id='txtUsername']") WebElement username;
	@FindBy(xpath = "//input[@id='txtPassword']")WebElement password;
	@FindBy(xpath = "//input[@id='btnLogin']") WebElement loginBtn;
	//write method
	public void HRMLogin(String user,String pass)
	{
		this.username.sendKeys(user);
		this.password.sendKeys(pass);
		this.loginBtn.click();
		String Expected ="dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			Reporter.log("Login success",true);
		}
		else
		{
			Reporter.log("Login Unsuccess",true);
		}
	}
	
}
