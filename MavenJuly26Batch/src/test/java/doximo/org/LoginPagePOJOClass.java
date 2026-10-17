package doximo.org;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOJOClass extends BaseClass {

	public LoginPagePOJOClass() {		
		PageFactory.initElements(driver,this);
	}
	
	
	//Declare web element as private
	
	@FindBy(id="login2")
	private List<WebElement>logIn;
	
	@FindBy(id="loginusername")
	private List<WebElement>txtUser;
	
	@FindBy(id="loginpassword")
	private List<WebElement>txtPass;
	
	@FindBy(xpath="//button[@onclick='logIn()']")
	private List<WebElement>btn;

	public List<WebElement> getLogIn() {
		return logIn;
	}

	public List<WebElement> getTxtUser() {
		return txtUser;
	}

	public List<WebElement> getTxtPass() {
		return txtPass;
	}

	public List<WebElement> getBtn() {
		return btn;
	} 
	
	
	
	
	
}
