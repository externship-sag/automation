package stepdefination;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.shoppage;
import util.TestContextsetup;

public class productstepdefination {

	public WebDriver driver;
	
	 TestContextsetup testContextSetup;
	shoppage page;

	public productstepdefination(TestContextsetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.page=testContextSetup.pageobjectmanager.getshoppage();
		
	}
	@Given("Click on Shop menu")
	public void click_on_Shop_menu() {
		page.Shop();
	    
	}

@Then("Click any of the product links available in the product category")
public void click_any_of_the_product_links_available_in_the_product_category() {
	
	 page.productlist();
}
@Then("Now user can view only that particular product")
public void now_user_can_view_only_that_particular_product() {
	System.out.println("list of particular item displayed");
    
}


}
