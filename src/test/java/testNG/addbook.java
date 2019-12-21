package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addbook {
  WebDriver driver;
  @BeforeMethod
  public void launch() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless");
	    
		driver = new ChromeDriver(options);
	 
	  
	  driver.manage().window().maximize();
	  driver.get("http://35.192.40.33:32768/addressbook/");
	  
  }
	
	@Test
  public void addbookfunc() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("selenium");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("testing");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("9000000000");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("a@gmail.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("07/7/93");
		driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
				
  }
	
	 @AfterMethod()
	  public void close() {
		  driver.close();
	  }
}
