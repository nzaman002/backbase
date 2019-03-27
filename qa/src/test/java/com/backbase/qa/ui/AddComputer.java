package com.backbase.qa.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement ;

public class AddComputer {

	public WebDriver driver;	
	public AddComputer(WebDriver driver){
		this.driver= driver;
	}
	
	public By computerName  = By.id("name");
	public WebElement getComputerName(){
		return driver.findElement(computerName);
	}
	
	
	public By introducedDate  = By.name("introduced");
	public WebElement getIntroduceDate(){
		return driver.findElement(introducedDate);
	}
	
	
	
	public By discontinuedDate  = By.xpath(".//*[@id='discontinued']");;
	public WebElement getDiscontinueDate(){
		return driver.findElement(discontinuedDate);
	}
    
	
	public By companyDropdown  = By.id("company");
	public WebElement getCompanyDropdown(){
		return driver.findElement(companyDropdown);
	}
	
	public By createButton  =By.xpath(".//*[@id='main']/form/div/input");
	public WebElement getCreateButton(){
		return driver.findElement(createButton);
	}

}
