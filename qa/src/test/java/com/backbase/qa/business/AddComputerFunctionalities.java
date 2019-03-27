package com.backbase.qa.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.backbase.qa.ui.AddComputer;

public class AddComputerFunctionalities extends AddComputer{

	public AddComputerFunctionalities(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void addNewComputer (String name , String introDate , String discontinueDate , String company) {
		getComputerName().sendKeys(name);
		getIntroduceDate().sendKeys(introDate);
		getDiscontinueDate().sendKeys(discontinueDate);
		Select drpCountry = new Select(getCompanyDropdown());
		drpCountry.selectByVisibleText(company);
		getCreateButton().click();
		
		
		}
	
	public void cancelAddNewComputerPage() {
		
	}

}
