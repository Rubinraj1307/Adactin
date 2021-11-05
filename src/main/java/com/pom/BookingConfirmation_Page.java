package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation_Page {
	public WebDriver driver;
	@FindBy(xpath="//input[@value='My Itinerary']")
	private WebElement bookingsbt;
	public BookingConfirmation_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getBookingsbt() {
		return bookingsbt;
	}

}
