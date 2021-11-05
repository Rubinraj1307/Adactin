package com.run1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Addactin_Project.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\featurefile\\adactin.feature",
glue= "com.stepd", dryRun = false, strict = true,
plugin= {"html:Report/HtmlReport","com.cucumber.listener.ExtentCucumberFormatter:target/extreport.html"}
		)
public class Test_Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() {
driver = Base_Class.get_driver("chrome");
	}
	
	@AfterClass
	public static void tear_down() {
		driver.close();
	}
	}