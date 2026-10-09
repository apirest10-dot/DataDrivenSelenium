package config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import HRM.pages.AdminLogin;
import HRM.pages.AdminLogout;

public class AppUtil {
public static WebDriver driver;
@BeforeTest
public static void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://orangehrm.qedgetech.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//call Admin login page class
	AdminLogin login = PageFactory.initElements(driver, AdminLogin.class);
	//call login method 
	login.HRMLogin("Admin", "Qedge123!@#");
	
}
@AfterTest
public static void tearDown() throws Throwable
{
	AdminLogout logout =PageFactory.initElements(driver, AdminLogout.class);
	logout.erpLogout();
	driver.quit();
}
}
