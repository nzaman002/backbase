package com.backbase.qa.business;

import org.openqa.selenium.WebDriver;

import com.backbase.qa.ui.HomePage;

public class HomePageFunctionalities extends HomePage {

	public HomePageFunctionalities(WebDriver driver) {
		super(driver);
		
	}
	
	public void addNewComputer() {
		getAddNewComputerButton().click();
		
	}
	

}
