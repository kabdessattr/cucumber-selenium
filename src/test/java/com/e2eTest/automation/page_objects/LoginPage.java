package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LoginPage extends BasePage {

	public LoginPage() {
		super(Setup.getDriver());
	}
/*Retrieve element*/ 
	@FindBy(how = How.NAME, using = "username")
	private static WebElement username; 
	
	/*Methods */ 
	public void getUsername(String name) {
	 username.sendKeys(name);
}
}