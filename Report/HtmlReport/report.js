$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/featurefile/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking By Using Adactin Hotel Application",
  "description": "",
  "id": "hotel-booking-by-using-adactin-hotel-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-by-using-adactin-hotel-application;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "hotel-booking-by-using-adactin-hotel-application;login;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 10,
      "id": "hotel-booking-by-using-adactin-hotel-application;login;;1"
    },
    {
      "cells": [
        "mack",
        "mession123"
      ],
      "line": 11,
      "id": "hotel-booking-by-using-adactin-hotel-application;login;;2"
    },
    {
      "cells": [
        "rubinraj",
        "P@ssw0rd"
      ],
      "line": 12,
      "id": "hotel-booking-by-using-adactin-hotel-application;login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-by-using-adactin-hotel-application;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"mack\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"mession123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 6961755000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mack",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 1459073200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mession123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});fformatter.result({
  "duration": 605745300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});formatter.result({
  "duration": 1487924800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-by-using-adactin-hotel-application;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"rubinraj\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"P@ssw0rd\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 694751600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rubinraj",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 393766200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "P@ssw0rd",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 293822900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1768459300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Hotel Searching",
  "description": "",
  "id": "hotel-booking-by-using-adactin-hotel-application;hotel-searching",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "user Select The \"New York\" In Location",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user Select The \"Hotel Sunshine\" In Hotels",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select The \"Deluxe\"  In Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The \"3\" In Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Clear And Entered  \"26/10/2021\"  In The Check In Data Box",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Clear And Entered  \"28/10/2021\"  In The Check Out Data Box",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The \"2\" in Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The \"1\" in Childrens Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Click On The Search Button And Its Navigates To Select Hotel page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Location(String)"
});
formatter.result({
  "duration": 908291200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Hotels(String)"
});
formatter.result({
  "duration": 368597700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deluxe",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Room_Type(String)"
});
formatter.result({
  "duration": 304080900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Number_Of_Rooms(String)"
});
formatter.result({
  "duration": 358050900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "26/10/2021",
      "offset": 25
    }
  ],
  "location": "Step_Definition.user_Clear_And_Entered_In_The_Check_In_Data_Box(String)"
});
formatter.result({
  "duration": 485395100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "28/10/2021",
      "offset": 25
    }
  ],
  "location": "Step_Definition.user_Clear_And_Entered_In_The_Check_Out_Data_Box(String)"
});
formatter.result({
  "duration": 495546800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_in_Adults_Per_Room(String)"
});
formatter.result({
  "duration": 270736100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_in_Childrens_Per_Room(String)"
});
formatter.result({
  "duration": 580593100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Search_Button_And_Its_Navigates_To_Select_Hotel_page()"
});
formatter.result({
  "duration": 2718621000,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking-by-using-adactin-hotel-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "user Click The Select Button",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user click The Continue Button And Its Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Select_Button()"
});
formatter.result({
  "duration": 169773800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_The_Continue_Button_And_Its_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1655662900,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Book A Hotel",
  "description": "",
  "id": "hotel-booking-by-using-adactin-hotel-application;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "user Entered The \"Rubin\" In First Name",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user Entered The \"Raj\" In Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Entered The \"5A,SreeNagar,Porur\" In Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Enter The CreditCard Number",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select The \"VISA\" In Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Select The \"3\" In Expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Select The \"2022\" In Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Entered The CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Click The Book Now Button And Its Navigates To Booking Confirmation Pages",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Rubin",
      "offset": 18
    }
  ],
  "location": "Step_Definition.user_Entered_The_In_First_Name(String)"
});
formatter.result({
  "duration": 402767200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raj",
      "offset": 18
    }
  ],
  "location": "Step_Definition.user_Entered_The_In_Last_Name(String)"
});
formatter.result({
  "duration": 362644800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5A,SreeNagar,Porur",
      "offset": 18
    }
  ],
  "location": "Step_Definition.user_Entered_The_In_Billing_Address(String)"
});
formatter.result({
  "duration": 391792200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_CreditCard_Number()"
});
formatter.result({
  "duration": 359904600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Credit_Card_Type(String)"
});
formatter.result({
  "duration": 1019794500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Expiry_Month(String)"
});
formatter.result({
  "duration": 500519400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Expiry_Year(String)"
});
formatter.result({
  "duration": 728188300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Entered_The_CVV_Number()"
});
formatter.result({
  "duration": 393443500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Book_Now_Button_And_Its_Navigates_To_Booking_Confirmation_Pages()"
});
formatter.result({
  "duration": 147951000,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Logout",
  "description": "",
  "id": "hotel-booking-by-using-adactin-hotel-application;logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "user Click The Logout Button And Its Navigates To Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Logout_Button_And_Its_Navigates_To_Home_Page()"
});
formatter.result({
  "duration": 1432657200,
  "status": "passed"
});}});