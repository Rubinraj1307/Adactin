package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
public static WebDriver driver;

@FindBy(xpath="//a[text()='Logout']")
private WebElement logoutbtn;

public Logout(WebDriver driver2) {
	
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
}

public WebElement getLogoutbtn() {
	return logoutbtn;
}

}
