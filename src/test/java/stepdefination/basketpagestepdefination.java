package stepdefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Readpage;
import pageobjects.basketpage;
import pageobjects.shoppage;
import util.TestContextsetup;

public class basketpagestepdefination {

	
	public WebDriver driver;
	shoppage page;
	
	 TestContextsetup testContextSetup;
	 basketpage basket;
	
	
	public basketpagestepdefination(TestContextsetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.page=testContextSetup.pageobjectmanager.getshoppage();
		this.basket=testContextSetup.pageobjectmanager.getbasketpage();
	}
	@Given("click on Shop menu")
	public void click_on_Shop_menu() {
		
	 page.Shop();
	 
	}
	
	@When("Click on the Add To Basket button which adds that book to your basket")
	public void click_on_the_add_to_basket_button_which_adds_that_book_to_your_basket() {
		basket.basket();
	  
	}
	@Then("User can view that Book in the Menu item with price .")
	public void user_can_view_that_book_in_the_menu_item_with_price() {
	 
		
	}
	@Then("Now click on View Basket link which navigates to proceed to check out page.")
	public void now_click_on_view_basket_link_which_navigates_to_proceed_to_check_out_page() {
		basket.View();
	 
	}
	@Then("Now user can find total and subtotal values just above the Proceed to Checkout button.")
	public void now_user_can_find_total_and_subtotal_values_just_above_the_proceed_to_checkout_button() {
	    
	}
	@Then("The total always < subtotal because taxes are added in the subtotal")
	public void the_total_always_subtotal_because_taxes_are_added_in_the_subtotal() {
	 
	}
	@Then("Now click on Proceed to Check out button which navigates to payment gateway page.")
	public void now_click_on_proceed_to_check_out_button_which_navigates_to_payment_gateway_page() {
		basket.ProceedtoCheckout();
	
	}
	@Then("User can view Billing Details,Order Details,Additional details and Payment gateway details.")
	public void user_can_view_billing_details_order_details_additional_details_and_payment_gateway_details() {
		//Assert.assertTrue(basket.Verifydetail()
				}
	@Then("Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.")
	public void now_user_can_fill_his_details_in_billing_details_form_and_can_opt_any_payment_in_the_payment_gateway_like_direct_bank_transfer_cheque_cash_or_paypal() {
	 
		basket.details();
		
	}
	@Then("Now click on Place Order button to complete process")
	public void now_click_on_place_order_button_to_complete_process() {
	   basket.order();
	  
	}
	@Then("On clicking place order button user completes his process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.")
	public void on_clicking_place_order_button_user_completes_his_process_where_the_page_navigates_to_order_confirmation_page_with_order_details_bank_details_customer_details_and_billing_details() {
	
		
		Assert.assertTrue(basket.VerifyPlaceOrder());
	}

	
}
