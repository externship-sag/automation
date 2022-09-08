package pageobjects;



import org.openqa.selenium.WebDriver;

public class pageobjectmanager {
	public  WebDriver driver;
	public shoppage page;
	public sortingpage pages;
	public Readpage read;
	public basketpage basket;

	
	public pageobjectmanager(WebDriver driver) {
		this.driver=driver;
	}
	
	public  shoppage getshoppage()
	{
		shoppage page=new shoppage(driver);
		return page;
	}
	
	public sortingpage getsortingpage()
	{
		sortingpage pages=new sortingpage(driver);
		return pages;
	}
	
	public Readpage getReadpage()
	{
		Readpage read=new Readpage(driver);
		return read;
	}
	public basketpage getbasketpage()
	{
		basketpage basket=new basketpage(driver);
		return basket;
	}

}
