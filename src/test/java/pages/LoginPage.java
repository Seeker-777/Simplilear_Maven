package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
	WebDriver driver;
	//================== Web Elements =============
	
	@FindBy(linkText="Login in")
	WebElement linklogin;
	
	@FindBy(name="user_login")
	WebElement editUsername;
	
	@FindBy(name="user_pwd")
	WebElement editPwd;
	
	@FindBy(className="rememberMe")
	WebElement chkBox;
	
	@FindBy(linkText="btn_login")
	WebElement btnPwd;
	
	
	
	public LoginPage(WebDriver testdriver) {
		
		
		this.driver = testdriver;
		PageFactory.initElements(driver, this);
	}
	
	
	//========================= Methods ========================
public void Login(String Username, String Password) {
		
		
		linklogin.click();
		
		editUsername.sendKeys(Username);
		
		editPwd.sendKeys(Password);
		
		chkBox.click();
		
		btnPwd.click();
		
}			
}
