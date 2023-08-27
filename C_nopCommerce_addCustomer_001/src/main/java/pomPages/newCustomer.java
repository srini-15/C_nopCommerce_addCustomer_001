package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseclass;

public class newCustomer {

	private baseclass bc=new baseclass();
	
	@FindBy(xpath="//*[@id=\"Email\"]")
	private WebElement mail;
	@FindBy(xpath="//*[@id=\"Password\"]")
	private WebElement pass;
	@FindBy(xpath="//*[@id=\"FirstName\"]")
	private WebElement fname;
	@FindBy(xpath="//*[@id=\"LastName\"]")
	private WebElement lname;
	@FindBy(xpath="//*[@id=\"Gender_Male\"]")
	private WebElement gender;
	@FindBy(xpath="//*[@id=\"Company\"]")
	private WebElement company;
	
	@FindBy(xpath="//*[@id=\"DateOfBirth\"]")
	private WebElement dob;
	
	@FindBy(xpath="//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")
	private WebElement deleterole;
	
	@FindBy(xpath="//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div")
	private WebElement selectrole;
	
	@FindBy(xpath="//*[@id=\"SelectedCustomerRoleIds_listbox\"]/li[3]")
	private WebElement vendorrole;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/form/div[1]/div/button[1]")
	private WebElement save;
	
//	@FindBy(xpath="//*[@id=\"SearchMonthOfBirth\"]")
//	private WebElement month;
//	@FindBy(xpath="//*[@id=\"SearchDayOfBirth\"]")
//	private WebElement day;
	
	
//	public WebElement getMonth() {
//		return month;
//	}
//
//	public WebElement getDay() {
//		return day;
//	}

	public newCustomer() {
		PageFactory.initElements(bc.driver, this);
	}
	
	

	public void mail() {
		mail.sendKeys("google3@gmail.com");
	}
	
	public void deleterole() {
		deleterole.click();	
	}
	
	public void selectrole() {
		selectrole.click();	
	}
	
	public void vendorrole() {
		vendorrole.click();	
	}
	public void pass() {
		pass.sendKeys("1234567890");
	}
	public void dob() {
		dob.sendKeys("03/15/1995");
	}
	public void fname() {
		fname.sendKeys("shivaji");
	}
	

	public void lname() {
		lname.sendKeys("rao");
	}
	
	public void company() {
		company.sendKeys("TCS");
	}
	
	public void gender()
	{
		gender.click();
	}
	
	public void save() {
		save.click();
	}
	
}
