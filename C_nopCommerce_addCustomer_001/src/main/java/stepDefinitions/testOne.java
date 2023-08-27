package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import baseClass.baseclass;
import driverUtils.utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomPages.customerPage;
import pomPages.dashbdPage;
import pomPages.firstPage;
import pomPages.newCustomer;

public class testOne {

	private firstPage fp;
	private baseclass bc;
	private dashbdPage dp;
	private newCustomer nc;
	private customerPage cp;
	private utils u;
	
	@Given("user is in login page as {string}")
	public void user_is_in_login_page_as(String string) {
		bc=new baseclass();
	   String title=bc.driver.getTitle();
	   Assert.assertEquals(title, string);
	   System.out.println("User reached login page successfully");
	}

	@When("user should enters the {string} and {string}")
	public void user_should_enters_the_and(String string, String string2) {
		fp= new firstPage();
		fp.getEmail().clear();
		fp.email(string);
		fp.getPassword().clear();
	    fp.password(string2);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		fp= new firstPage();
	    fp.login();
	}

	@When("user is in Dashboard page {string}")
	public void user_is_in_dashboard_page(String string) {
		bc=new baseclass();
		String title=bc.driver.getTitle();
		   Assert.assertEquals(title, string);
		   System.out.println("User reached Dashboard page successfully");
	}

	@Then("click on customers option")
	public void click_on_customers_option() {
	    dp= new dashbdPage();
	    dp.customer1();
	}

	@Then("click on customers button on customer option")
	public void click_on_customers_button_on_customer_option() {
		dp= new dashbdPage();
	    dp.customer2();
	}

	@Then("click on addnew customer button")
	public void click_on_addnew_customer_button() {
		cp= new customerPage();
	   cp.add();
	}

	@Then("Fill the valid customer details and save")
	public void fill_the_valid_customer_details_and_save() throws InterruptedException {
		nc= new newCustomer();
	    u= new utils();
	    nc.mail();
	    nc.pass();
	    nc.lname();
	    nc.fname();
	    nc.company();
	    nc.dob();
	    u.scrolldown();
	    nc.deleterole();
	    nc.selectrole();
	    nc.vendorrole();
	    u.scrollup();
	    nc.save();
	}

	@Then("message should shown as {string}")
	public void message_should_shown_as(String string) {
		bc=new baseclass();
	   if( bc.driver.getPageSource().contains("The new customer has been added successfully.")) {
		   Assert.assertEquals(string, "The new customer has been added successfully.");
		   System.out.println("pass");}
	   else
		   System.out.println("fail");
	}


	@Then("enter the mail id {string} and search it")
	public void enter_the_mail_id_and_search_it(String string) throws InterruptedException {
	    cp= new customerPage();
	    cp.mail();
	    cp.deselectrole();
	    cp.search();
	    
	}

	@Then("scroll down and take a screenshot")
	public void scroll_down_and_take_a_screenshot() throws IOException, InterruptedException {
		u= new utils();
		cp= new customerPage();
	    u.scroll(cp.getFooter());
	    Thread.sleep(3000);
	    u.screenshot();
	}
}
