package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseclass;

public class customerPage {

	private baseclass bc=new baseclass();
	@FindBy(xpath="/html/body/div[3]/div[1]/form[1]/div/div/a")
	private WebElement add;
	
	@FindBy(xpath="//*[@id=\"SearchEmail\"]")
	private WebElement mail;
	
	@FindBy(xpath="//*[@id=\"search-customers\"]")
	private WebElement search;
	
	@FindBy(xpath="//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")
	private WebElement deselectrole;
	
	@FindBy(xpath="//*[@id=\"customers-grid_wrapper\"]")
	private WebElement footer;
	
	
	public customerPage() {
		PageFactory.initElements(bc.driver, this);
	}
	public void add() {
		add.click();
	}
	
	public WebElement getFooter() {
		return footer;
	}
	public void mail() {
		mail.sendKeys("google3@gmail.com");
	}
	
	public void search() {
		search.click();
	}
	public void deselectrole() {
		deselectrole.click();
	}
}
