package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class basketpage {
	
	public WebDriver driver;
	public basketpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By add=By.xpath("//*[@id='content']/ul/li[4]/a[2]");
    By view=By.xpath("//*[@id='content']/ul/li[4]/a[3]");
	By checkout=By.xpath("//*[@id='page-34']/div/div[1]/div/div/div/a");
	By firstname=By.id("billing_first_name");
	By lastname=By.id("billing_last_name");
	By companyname=By.id("billing_company");
	By email=By.id("billing_email");
	By phone=By.id("billing_phone");
	By country=By.id("billing_country");
	By address=By.id("billing_address_1");
	By address2=By.id("billing_address_2");
	By city=By.id("billing_city");
	By state=By.id("select2-chosen-2");
	By postcode=By.id("billing_postcode");
	By transfer=By.xpath("//*[@id='payment_method_bacs']");
	By place=By.id("place_order");
	public void basket()
	{
		driver.findElement(add).click();
	}
	
	public void View()
	{
		driver.findElement(view).click();
	}
	
	public void ProceedtoCheckout()
	{
		driver.findElement(checkout).click();
	}
	
	
	public void details()
	{
		driver.findElement(firstname).sendKeys("Swati");
		driver.findElement(lastname).sendKeys("Gupta");
		driver.findElement(companyname).sendKeys("Samsung Electronics");
		driver.findElement(email).sendKeys("swatig139@gmail.com");
		driver.findElement(phone).sendKeys("9538466787");
		WebElement dropdown=driver.findElement(country);
		Select selectobject=new Select(dropdown);
		
		driver.findElement(address).sendKeys("E-401,Rajpaliya");
		driver.findElement(address2).sendKeys("ittina Akkala apartment,near hoodie");
		driver.findElement(city).sendKeys("Bangalore");
		WebElement dropdown1=driver.findElement(state);
		Select selectobject1=new Select(dropdown);
		
		driver.findElement(postcode).sendKeys("560048");
		driver.findElement(transfer).click();
		
	}

	public void order()
	{
		driver.findElement(place).click();
		
	}
	 public Boolean VerifyPlaceOrder() {
		return driver.findElement(place).isDisplayed();
		
		
	}

}
