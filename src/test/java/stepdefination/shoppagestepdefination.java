package stepdefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.pageobjectmanager;
import pageobjects.shoppage;
import util.TestContextsetup;


public class shoppagestepdefination {
	public WebDriver driver;
	shoppage page;
	 TestContextsetup testContextSetup;
	
	
	public shoppagestepdefination(TestContextsetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.page=testContextSetup.pageobjectmanager.getshoppage();
	}
	
	
	@Then("click on shop menu")
	public void click_on_shop_menu() {
		
	 page.Shop();
	 
	}
	@Then("Adjust the filter by price between {int} to {int} rps")
	public void adjust_the_filter_by_price_between_to_rps(Integer range1, Integer range2) {
		page.slider();
		
	}
	@Then("click on filter button")
	public void click_on_filter_button() {
	
		page.filterbutton();
	}
	@Then("User can view books only between {int} to {int} rps price")
	public void user_can_view_books_only_between_to_rps_price(Integer int1, Integer int2) {
		page.range();
	    
	}
	
	
}
