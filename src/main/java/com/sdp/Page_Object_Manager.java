package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.BookingConfirmation_Page;
import com.pom.Home_page;
import com.pom.HotelBooking_Page;
import com.pom.Logout;
import com.pom.Search_Hotel_page;
import com.pom.Select_Hotel_page;

public class Page_Object_Manager {
	public WebDriver driver;
	
	private Home_page hp;
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Home_page getinstance_Homepage() {

		 hp = new Home_page(driver);
		return hp;
	}

	
	private Search_Hotel_page shp;
	public Search_Hotel_page getinstance_Search_Hotelpage() {

		 shp = new Search_Hotel_page(driver);
		return shp;
	}
	
	
	private Select_Hotel_page sh;
	
	public Select_Hotel_page getinstance_SelectHotel_page() {
		Select_Hotel_page sh = new  Select_Hotel_page(driver);
return sh;
		
	}
	
	private HotelBooking_Page hbp;
	
	public HotelBooking_Page getinstance_Bookingpage() {
 hbp = new HotelBooking_Page(driver);
return hbp;
	}
	
	private BookingConfirmation_Page bp;
	 public BookingConfirmation_Page getinstance_bookings() {
BookingConfirmation_Page bp = new BookingConfirmation_Page(driver);
return bp;
		 
	}
	 
	 private Logout lg;
	 public Logout getinstance_bookedlist() {
 lg = new Logout(driver);
return lg;
		 
	}
	
	
	
}
