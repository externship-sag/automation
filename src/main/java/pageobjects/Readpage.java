package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Readpage {
	
	public WebDriver driver;
	public Readpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
  By read=By.xpath("//*[@id='content']/ul/li[1]/a[2]");
  By indicate=By.xpath("//*[@id='product-169']/div[2]/p");
  By sale=By.xpath("//*[@id='content']/ul/li[1]/a[1]/span[1]");
 
  
  public void Read()
  {
	  driver.findElement(read).click();
  }
  
  public boolean display()
  
  {
	  driver.findElement(indicate).isDisplayed();
	 return true;
  }
  
  public void Sale()
  {
	  driver.findElement(sale).click();
  }
  
}
