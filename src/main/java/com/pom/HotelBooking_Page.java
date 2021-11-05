package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBooking_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement billingaddress;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement creditcardno;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement creditcardtype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expirymonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expiryyear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvnumber;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknowbt;

	public HotelBooking_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknowbt() {
		return booknowbt;
	}
	
}
