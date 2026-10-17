package com.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	
	@Before
	public void beforeExecution() {
		launchBrowser();
		maximizeWindow();
		loadUrl("https://www.demoblaze.com/");
	}
	
	@After
	public void afterExecution() {
		quitBrowser();

	}
}
