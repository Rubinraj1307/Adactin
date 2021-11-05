package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_page {
	public WebDriver driver;
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement noofrooms;
	
	@FindBy(xpath="(//input[@class='date_pick'])[1]")
	private WebElement checkin;
	
	@FindBy(xpath="(//input[@class='date_pick'])[2]")
	private WebElement checkout;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultsroom;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childrenroom;
	
	@FindBy(id="Submit")
	private WebElement search;

	public Search_Hotel_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultsroom() {
		return adultsroom;
	}

	public WebElement getChildrenroom() {
		return childrenroom;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
