package com.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPOJOClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends BaseClass {
	public static WebDriver driver;
	LoginPOJOClass l;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		l=new LoginPOJOClass();
		btnLogin(l.getLogIn());
		
		
	    
	}
	@When("User enters the username,password and click login button")
	public void user_enters_the_username_password_and_click_login_button() {
		l=new LoginPOJOClass();
		types(l.getTxtUser(),"yoga123");
		types(l.getTxtPass(),"Yoga@123");
		btnLogin(l.getBtn());
		
		
	}
	@Then("User get success message")
	public void user_get_success_message() {
	 System.out.println("Done...");
	}

}
