package test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;


public class Testcase1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","/home/shashikumartecn/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		
	}

	@Test
	public void LoginTest() {
		
		LoginPage objLog = new LoginPage(driver);
		objLog.Login("abxc@xyz.com","7777");
	}
	
	@AfterMethod
	public void CloseBrowser() {
	
	driver.quit();

}


}
