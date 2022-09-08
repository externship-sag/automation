package stepdefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageobjects.shoppage;
import pageobjects.sortingpage;
import util.TestContextsetup;

public class sortingpagestepdefination {
	public WebDriver driver;
	shoppage page;
	sortingpage pages;
	 TestContextsetup testContextSetup;
	
	
	public sortingpagestepdefination(TestContextsetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.page=testContextSetup.pageobjectmanager.getshoppage();
		this.pages=testContextSetup.pageobjectmanager.getsortingpage();
	}
	
	@Then("Click on shop menu")
	public void Click_on_shop_menu() {
		
	 page.Shop();
	 
	}

	
	@Then("Click on Sort by Popularity item in Default sorting dropdown")
	public void click_on_sort_by_popularity_item_in_default_sorting_dropdown() {
		
	  pages.select();
		
	}
	@Then("Now user can view the popular products only")
	public void now_user_can_view_the_popular_products_only() {
		
		
		pages.display();
		
		
	
}
}
