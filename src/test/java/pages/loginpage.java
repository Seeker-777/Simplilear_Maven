package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
	
	WebDriver driver;
	
	
	public loginpage(WebDriver testdriver) {
		
		this.driver=testdriver;
	}
	
public void login(String Username, String Password) {
		
		WebElement linklogin = driver.findElement(By.linkText("Log in"));
		
		linklogin.click();
		
		
		WebElement editUsername = driver.findElement(By.name("user_login"));
		
		editUsername.sendKeys(Username);
		
		WebElement editPwd = driver.findElement(By.name("user_pwd"));
		
		editPwd.sendKeys(Password);
		
		WebElement chkBox = driver.findElement(By.className("rememberMe"));
		
		chkBox.click();
		
		WebElement btnPwd = driver.findElement(By.name("btn_login"));
		
		btnPwd.click();
		
}			

}
