package ERP.libraries;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.AppUtils;

public class LoginPage extends AppUtils {
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="btnsubmit")
	WebElement submit;
	
	
	public void pageObject() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String uname, String pwd) {
		username.clear();
		password.clear();
		username.sendKeys(uname);
		password.sendKeys(pwd);
		submit.click();
		
		
	}
	
	
	
	public void logout() {
		
	}
	

}
