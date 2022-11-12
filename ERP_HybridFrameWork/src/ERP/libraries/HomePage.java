package ERP.libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.AppUtils;

public class HomePage extends AppUtils{
	
	@FindBy(id="ewPageCaption")
	WebElement dash;
	
	public void pageObject() {
		PageFactory.initElements(driver, this);
	}
	public boolean dashboard () {
		String res = dash.getText().toLowerCase();
		if(res.equals("dashboard")) {
			return true;
		}else {
			return false;
		}
		
	}
}
