package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class sortingpage {
	
	
	public WebDriver driver;
	public sortingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By drop=By.xpath("//*[@id='content']/form/select");
	
	
	
	public void select()
	{
		driver.findElement(By.name("orderby")).click();
		WebElement dropdown=driver.findElement(drop);
		Select selectobject=new Select(dropdown);
		selectobject.selectByValue("popularity");
				
	}
	public void display()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,600)");
		System.out.println("items are displayed");
	}
	
}
