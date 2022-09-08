package util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjects.pageobjectmanager;




public class TestContextsetup {
	

	public WebDriver driver;
	//public String landingPageProductName;
	public pageobjectmanager pageobjectmanager;
	public testbase base;
	//public Object pageobjectmanager;
	//public GenericUtils genericutils;
	//public ChromeDriver driver;
	//public ChromeDriver driver;
	public TestContextsetup() throws IOException {
		base=new testbase();
		
		 pageobjectmanager = new pageobjectmanager(base.WebDrivermanager());
		// genericutils=new GenericUtils(testbase.WebDrivermanager());
		
	}

}
