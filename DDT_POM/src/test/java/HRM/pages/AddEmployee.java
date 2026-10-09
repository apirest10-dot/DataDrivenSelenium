package HRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddEmployee {
	WebDriver driver;
//write constructor
	public AddEmployee(WebDriver driver)
	{
		this.driver=driver;
	}
	//define OR
	@FindBy(xpath = "//b[normalize-space()='PIM']") WebElement clickPim;
	@FindBy(xpath = "//input[@id='btnAdd']") WebElement clickAdd;
	@FindBy(xpath = "//input[@id='firstName']") WebElement Enterfname;
	@FindBy(xpath = "//input[@id='middleName']") WebElement Entermname;
	@FindBy(xpath = "//input[@id='lastName']") WebElement Enterlname;
	@FindBy(xpath = "//input[@id='employeeId']") WebElement BeforeEid;
	@FindBy(xpath = "//input[@id='btnSave']") WebElement clickSave;
	@FindBy(xpath = "//input[@id='personal_txtEmployeeId']") WebElement AfterEid ;
	//method for Add Emp
	public boolean addEmp(String Fname,String Mname,String Lname) throws Throwable
	{
		this.clickPim.click();
		Thread.sleep(2000);
		this.clickAdd.click();
		Thread.sleep(2000);
		this.Enterfname.sendKeys(Fname);
		this.Entermname.sendKeys(Mname);
		this.Enterlname.sendKeys(Lname);
		String Exp_Eid = this.BeforeEid.getAttribute("value");
		this.clickSave.click();
		String Act_Eid = this.AfterEid.getAttribute("value");
		if(Act_Eid.equals(Exp_Eid))
		{
			Reporter.log("Add Employee Success:"+" "+Exp_Eid+"   "+Act_Eid,true);
			return true;
		}
		else
		{
			Reporter.log("Add Employee UnSuccess:"+" "+Exp_Eid+"   "+Act_Eid,true);
			return false;
		}
	}
	
	
}
