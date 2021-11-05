package com.Addactin_Project;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Runner_Class extends Base_Class {
	public static WebDriver driver = Base_Class.get_driver("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		waiting_time(20);

		get_url("https://adactinhotelapp.com/");

		String username = File_Reader_Manager.getinstance_FRM().getinstance_CR().getusername();
		inputboxvalue(pom.getinstance_Homepage().getUsername(), username);

		String password = File_Reader_Manager.getinstance_FRM().getinstance_CR().getpassword();
		inputboxvalue(pom.getinstance_Homepage().getPassword(), password);

		clickbutton(pom.getinstance_Homepage().getLoginbt());

		waiting_time(10);

		select(pom.getinstance_Search_Hotelpage().getLocation(), "byvalue", "New York");

		select(pom.getinstance_Search_Hotelpage().getHotels(), "byvalue", "Hotel Sunshine");

		select(pom.getinstance_Search_Hotelpage().getRoomtype(), "byvalue", "Deluxe");

		select(pom.getinstance_Search_Hotelpage().getNoofrooms(), "byvalue", "3");

		pom.getinstance_Search_Hotelpage().getCheckin().clear();
		inputboxvalue(pom.getinstance_Search_Hotelpage().getCheckin(), "21/10/2021");

		pom.getinstance_Search_Hotelpage().getCheckout().clear();
		inputboxvalue(pom.getinstance_Search_Hotelpage().getCheckout(), "23/10/2021");

		select(pom.getinstance_Search_Hotelpage().getAdultsroom(), "byvalue", "2");

		select(pom.getinstance_Search_Hotelpage().getChildrenroom(), "byvalue", "1");

		clickbutton(pom.getinstance_Search_Hotelpage().getSearch());

		waiting_time(10);

		clickbutton(pom.getinstance_SelectHotel_page().getSelectbtn());

		clickbutton(pom.getinstance_SelectHotel_page().getContinuebtn());

		waiting_time(10);

		inputboxvalue(pom.getinstance_Bookingpage().getFirstname(), "Rubin");

		inputboxvalue(pom.getinstance_Bookingpage().getLastname(), "raj");

		inputboxvalue(pom.getinstance_Bookingpage().getBillingaddress(), "5a,srinivasapuram,paraniputhur,chennai");

		String getcardnumber = File_Reader_Manager.getinstance_FRM().getinstance_CR().getcardnumber();
		inputboxvalue(pom.getinstance_Bookingpage().getCreditcardno(), getcardnumber);

		select(pom.getinstance_Bookingpage().getCreditcardtype(), "byvalue", "MAST");

		String expirymonth = File_Reader_Manager.getinstance_FRM().getinstance_CR().getexpirymonth();
		select(pom.getinstance_Bookingpage().getExpirymonth(), "byvalue", expirymonth);

		String expiryyear = File_Reader_Manager.getinstance_FRM().getinstance_CR().getexpiryyear();
		select(pom.getinstance_Bookingpage().getExpiryyear(), "byvalue", expiryyear);

		String getcvv = File_Reader_Manager.getinstance_FRM().getinstance_CR().getcvv();

		inputboxvalue(pom.getinstance_Bookingpage().getCvvnumber(), getcvv);

		clickbutton(pom.getinstance_Bookingpage().getBooknowbt());

		clickbutton(pom.getinstance_bookings().getBookingsbt());
	}

}
