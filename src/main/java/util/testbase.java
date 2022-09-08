package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class testbase {

	public WebDriver driver;
	
	public  WebDriver WebDrivermanager() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resource//global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		if(driver==null) {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resource//chromedriver.exe");
		
	    driver=new ChromeDriver();
			}
			if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
	    driver.get(url);
	    
	}
	    return driver;

}
}
