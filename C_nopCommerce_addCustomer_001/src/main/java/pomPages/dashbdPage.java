package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseclass;

public class dashbdPage {

	private baseclass bc=new baseclass();
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")
	private WebElement customer1;
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")
	private WebElement customer2;
	
	public dashbdPage() {
		PageFactory.initElements(bc.driver, this);
	}
	public void customer1() {
		customer1.click();
	}
	
	public void customer2() {
		customer2.click();
	}
}
