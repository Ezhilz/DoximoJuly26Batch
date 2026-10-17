package doximo.org;

import org.openqa.selenium.WebElement;

public class SampleMain extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser();
		maximizeWindow();
		loadUrl("https://www.demoblaze.com/");
		
		LoginPagePOJOClass l=new LoginPagePOJOClass();
		btnLogin(l.getLogIn().get(0));
		types(l.getTxtUser().get(0),"yoga123");
		types(l.getTxtPass().get(0),"Yoga@123");
		btnLogin(l.getBtn().get(0));

	}

}
