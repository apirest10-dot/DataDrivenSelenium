package HRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogout {
@FindBy(xpath = "//a[@id='welcome']") WebElement clickWelcome;
@FindBy(xpath = "//a[normalize-space()='Logout']") WebElement clicklogout;
public void erpLogout() throws Throwable
{
	clickWelcome.click();
	Thread.sleep(2000);
	clicklogout.click();
	
}
}
