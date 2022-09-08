package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;

public class shoppage {

	
	public WebDriver driver;
	public shoppage(WebDriver driver)
	{
		this.driver=driver;
	}
	By shop=By.xpath("//*[@id='menu-item-40']/a");
	By PriceSlider=By.xpath("//*[@id='woocommerce_price_filter-2']/form/div/div[1]/span[2]");
	By filterbutton=By.xpath("//*[@id='woocommerce_price_filter-2']/form/div/div[2]/button");
	By PriceRange=By.xpath("//*[@id='content']/ul/li[3]/a[1]/img");
	By list=By.xpath("//*[@id='woocommerce_product_categories-2']/ul/li[2]/a");
    By sort=By.xpath("//*[@id='content']/form/select");
    
	
	public void Shop()
	{
		driver.findElement(shop).click();
	}
	
	public void slider()
	{
		WebElement slider = driver.findElement(PriceSlider); 
		 Actions actions = new Actions(driver); 
		 actions.dragAndDropBy(slider, -27, 0).build().perform(); 
		 System.out.println("Slide Action performed.");
		
	}
	public void filterbutton()
	{
		driver.findElement(filterbutton).click();
	}
	public void range()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,600)");
		driver.findElement(PriceRange).isDisplayed();
	}
	public void productlist()
	{
		driver.findElement(list).click();
	}
	
}
	
	

	

