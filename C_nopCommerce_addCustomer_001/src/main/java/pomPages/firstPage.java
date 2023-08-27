package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseclass;

public class firstPage {

	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}

	private baseclass bc=new baseclass();
	
	@FindBy(xpath="//*[@id=\"Email\"]")
	private WebElement email;
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	private WebElement password;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	private WebElement login;
	
	public firstPage() {
		PageFactory.initElements(bc.driver, this);
	}
	public void email(String emai) {
		email.sendKeys(emai);
	}
	
	public void password(String pass) {
		password.sendKeys(pass);
	}
	
	public void login() {
		login.click();
	}
	
	
}
