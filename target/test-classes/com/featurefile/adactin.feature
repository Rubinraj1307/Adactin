Feature: Hotel Booking By Using Adactin Hotel Application

Scenario Outline: Login
Given user Launch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page

Examples:
|Username|Password|
|mack|mession123|
|rubinraj|P@ssw0rd|


Scenario: Hotel Searching
When user Select The "New York" In Location
And user Select The "Hotel Sunshine" In Hotels
And user Select The "Deluxe"  In Room Type
And user Select The "3" In Number Of Rooms
And user Clear And Entered  "26/10/2021"  In The Check In Data Box
And user Clear And Entered  "28/10/2021"  In The Check Out Data Box
And user Select The "2" in Adults Per Room
And user Select The "1" in Childrens Per Room
Then user Click On The Search Button And Its Navigates To Select Hotel page

Scenario: Select Hotel
When user Click The Select Button 
Then user click The Continue Button And Its Navigates To Book A Hotel Page

Scenario: Book A Hotel
When user Entered The "Rubin" In First Name
And user Entered The "Raj" In Last Name
And user Entered The "5A,SreeNagar,Porur" In Billing Address
And user Enter The CreditCard Number
And user Select The "VISA" In Credit Card Type 
And user Select The "3" In Expiry Month
And user Select The "2022" In Expiry Year
And user Entered The CVV Number
Then user Click The Book Now Button And Its Navigates To Booking Confirmation Pages


Scenario: Logout
Then user Click The Logout Button And Its Navigates To Home Page

