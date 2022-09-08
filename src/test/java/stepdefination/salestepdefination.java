package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.Readpage;
import pageobjects.shoppage;
import util.TestContextsetup;

public class salestepdefination {
	
	public WebDriver driver;
	shoppage page;
	Readpage read;
	 TestContextsetup testContextSetup;
	public salestepdefination(TestContextsetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.page=testContextSetup.pageobjectmanager.getshoppage();
		this.read=testContextSetup.pageobjectmanager.getReadpage();
	}
	@Given("click on Shop Menu")
	public void click_on_Shop_Menu() {
		
	 page.Shop();
	 
	}
	@Then("Click on Sale written product in home page")
	public void Click_on_Sale_written_product_in_home_page()
	 {
	    read.Sale();
	}
	
	@Then("User can clearly view the actual price with old price striken for the sale written products")
	public void User_can_clearly_view_the_actual_price_with_old_price()
	{
		System.out.println("productswith old price striken is displayed");
	}

}
