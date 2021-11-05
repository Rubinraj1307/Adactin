package com.stepd;

import org.openqa.selenium.WebDriver;

import com.Addactin_Project.Base_Class;
import com.helper.File_Reader_Manager;
import com.run1.Test_Runner;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;
	
	public static Page_Object_Manager pom = new  Page_Object_Manager(driver);
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
get_url("https://adactinhotelapp.com/");		
	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		inputboxvalue(pom.getinstance_Homepage().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		inputboxvalue(pom.getinstance_Homepage().getPassword(), password);
		
	}

	

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	clickbutton(pom.getinstance_Homepage().getLoginbt());
	}
	
	
	@When("^user Select The \"([^\"]*)\" In Location$")
	public void user_Select_The_In_Location(String location) throws Throwable {
		select(pom.getinstance_Search_Hotelpage().getLocation(), "byvalue", location);
	}

	@When("^user Select The \"([^\"]*)\" In Hotels$")
	public void user_Select_The_In_Hotels(String hotel) throws Throwable {
		select(pom.getinstance_Search_Hotelpage().getHotels(), "byvalue",hotel );
	}

	@When("^user Select The \"([^\"]*)\"  In Room Type$")
	public void user_Select_The_In_Room_Type(String roomtype) throws Throwable {
		select(pom.getinstance_Search_Hotelpage().getRoomtype(), "byvalue", roomtype);
	}

	@When("^user Select The \"([^\"]*)\" In Number Of Rooms$")
	public void user_Select_The_In_Number_Of_Rooms(String noofrooms) throws Throwable {
		select(pom.getinstance_Search_Hotelpage().getNoofrooms(), "byvalue", noofrooms);
	}
	
	@When("^user Clear And Entered  \"([^\"]*)\"  In The Check In Data Box$")
	public void user_Clear_And_Entered_In_The_Check_In_Data_Box(String checkin) throws Throwable {
		pom.getinstance_Search_Hotelpage().getCheckin().clear();
		inputboxvalue(pom.getinstance_Search_Hotelpage().getCheckin(), checkin);
		
	}

	@When("^user Clear And Entered  \"([^\"]*)\"  In The Check Out Data Box$")
	public void user_Clear_And_Entered_In_The_Check_Out_Data_Box(String checkout) throws Throwable {
		pom.getinstance_Search_Hotelpage().getCheckout().clear();
		inputboxvalue(pom.getinstance_Search_Hotelpage().getCheckout(), checkout);
		
	}

	
	@When("^user Select The \"([^\"]*)\" in Adults Per Room$")
	public void user_Select_The_in_Adults_Per_Room(String adultsroom) throws Throwable {
		select(pom.getinstance_Search_Hotelpage().getAdultsroom(), "byvalue", adultsroom);
	}

	@When("^user Select The \"([^\"]*)\" in Childrens Per Room$")
	public void user_Select_The_in_Childrens_Per_Room(String childrensroom) throws Throwable {
		select(pom.getinstance_Search_Hotelpage().getChildrenroom(), "byvalue", childrensroom);
	}

	@Then("^user Click On The Search Button And Its Navigates To Select Hotel page$")
	public void user_Click_On_The_Search_Button_And_Its_Navigates_To_Select_Hotel_page() throws Throwable {
		clickbutton(pom.getinstance_Search_Hotelpage().getSearch());
		
	}
	
	@When("^user Click the Select Button$")
	public void user_Click_the_Select_Button() throws Throwable {
		clickbutton(pom.getinstance_SelectHotel_page().getSelectbtn());
	}

	@Then("^user click the Continue Button And Its Navigates To Book A Hotel Page$")
	public void user_click_the_Continue_Button_And_Its_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		clickbutton(pom.getinstance_SelectHotel_page().getContinuebtn());
	}
	
	@When("^user Click The Select Button$")
	public void user_Click_The_Select_Button() throws Throwable {
		clickbutton(pom.getinstance_SelectHotel_page().getSelectbtn());
	}

	@Then("^user click The Continue Button And Its Navigates To Book A Hotel Page$")
	public void user_click_The_Continue_Button_And_Its_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		clickbutton(pom.getinstance_SelectHotel_page().getContinuebtn());
	}

	@When("^user Entered The \"([^\"]*)\" In First Name$")
	public void user_Entered_The_In_First_Name(String firstname) throws Throwable {
		inputboxvalue(pom.getinstance_Bookingpage().getFirstname(), firstname);
	}

	@When("^user Entered The \"([^\"]*)\" In Last Name$")
	public void user_Entered_The_In_Last_Name(String lastname) throws Throwable {
		inputboxvalue(pom.getinstance_Bookingpage().getLastname(), lastname);
		
	}

	@When("^user Entered The \"([^\"]*)\" In Billing Address$")
	public void user_Entered_The_In_Billing_Address(String address) throws Throwable {
		inputboxvalue(pom.getinstance_Bookingpage().getBillingaddress(), address);
	}

	@When("^user Enter The CreditCard Number$")
	public void user_Enter_The_CreditCard_Number() throws Throwable {
		String getcardnumber = File_Reader_Manager.getinstance_FRM().getinstance_CR().getcardnumber();
		inputboxvalue(pom.getinstance_Bookingpage().getCreditcardno(), getcardnumber);
	}

	@When("^user Select The \"([^\"]*)\" In Credit Card Type$")
	public void user_Select_The_In_Credit_Card_Type(String cardtype) throws Throwable {
		select(pom.getinstance_Bookingpage().getCreditcardtype(), "byvalue", cardtype);
	}

	@When("^user Select The \"([^\"]*)\" In Expiry Month$")
	public void user_Select_The_In_Expiry_Month(String expmonth) throws Throwable {
		select(pom.getinstance_Bookingpage().getExpirymonth(), "byvalue", expmonth);
	}

	@When("^user Select The \"([^\"]*)\" In Expiry Year$")
	public void user_Select_The_In_Expiry_Year(String expyear) throws Throwable {
		select(pom.getinstance_Bookingpage().getExpiryyear(), "byvalue", expyear);
	}

	@When("^user Entered The CVV Number$")
	public void user_Entered_The_CVV_Number() throws Throwable {
		String getcvv = File_Reader_Manager.getinstance_FRM().getinstance_CR().getcvv();
		inputboxvalue(pom.getinstance_Bookingpage().getCvvnumber(), getcvv);
		
	}

	@Then("^user Click The Book Now Button And Its Navigates To Booking Confirmation Pages$")
	public void user_Click_The_Book_Now_Button_And_Its_Navigates_To_Booking_Confirmation_Pages() throws Throwable {
		clickbutton(pom.getinstance_Bookingpage().getBooknowbt());
	}
	
//	
//	@Then("^user click The My Itenerary Button And Its Navigates To Booked Itenerary Page$")
//	public void user_click_The_My_Itenerary_Button_And_Its_Navigates_To_Booked_Itenerary_Page() throws Throwable {
//		clickbutton(pom.getinstance_bookings().getBookingsbt());
//	}

	@Then("^user Click The Logout Button And Its Navigates To Home Page$")
	public void user_Click_The_Logout_Button_And_Its_Navigates_To_Home_Page() throws Throwable {
		clickbutton(pom.getinstance_bookedlist().getLogoutbtn());
	}





	
	
	
	
	
	
	
}

	
	
	
