package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Readpage;
import pageobjects.shoppage;
import util.TestContextsetup;

public class Readpagestepdefination {

	public WebDriver driver;
	shoppage page;
	Readpage read;
	 TestContextsetup testContextSetup;
	
	
	public Readpagestepdefination(TestContextsetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.page=testContextSetup.pageobjectmanager.getshoppage();
		this.read=testContextSetup.pageobjectmanager.getReadpage();
	}
	@Given("Click on Shop Menu")
	public void Click_on_Shop_Menu() {
		
	 page.Shop();
	 
	}
	@When("Click on read more button in home page")
	public void click_on_read_more_button_in_home_page() {
		read.Read();
	
	}
	@Then("Read More option indicates the Out Of Stock.")
	public void read_more_option_indicates_the_out_of_stock() {
	    read.display();
	    System.out.println("out of stock is displayed") ;
	}
	@Then("User cannot add the product which has read more option as it was out of stock.")
	public void user_cannot_add_the_product_which_has_read_more_option_as_it_was_out_of_stock() {
		
		if(read.display())
		{
			System.out.println("out of stock is dispalyed");
			
		}
		else
		{
			 By addtoproduct=By.xpath("//*[@id='content']/ul/li[4]/a[2]");
			driver.findElement(addtoproduct).click();
				
				
			}
				
			
		}
	}

