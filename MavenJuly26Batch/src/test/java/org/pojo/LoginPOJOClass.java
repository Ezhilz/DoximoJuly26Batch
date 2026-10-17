package org.pojo;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJOClass extends BaseClass {
	
	public LoginPOJOClass() {		
		PageFactory.initElements(driver,this);
	}
	
	
	//Declare web element as private
	
	@FindBy(id="login2")
	private WebElement logIn;
	
	@FindBy(id="loginusername")
	private WebElement txtUser;
	
	@FindBy(id="loginpassword")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[@onclick='logIn()']")
	private WebElement btn;

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtn() {
		return btn;
	} 
	
	
	

}
