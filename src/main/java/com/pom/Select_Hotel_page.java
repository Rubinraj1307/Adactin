package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_page {
	
	public WebDriver driver;
	@FindBy(xpath="//input[@type='radio']")
	private WebElement selectbtn;

	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continuebtn;


	public Select_Hotel_page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
		
	}




	public WebElement getSelectbtn() {
		return selectbtn;
	}


	public WebElement getContinuebtn() {
		return continuebtn;
	}
}
