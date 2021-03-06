package com.backbase.qa.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement ;

public class HomePage {
	
	public WebDriver driver;	
	public HomePage(WebDriver driver){
		this.driver= driver;
	}
	
	
	public By addNewComputerButton  = By.id("add");
	public WebElement getAddNewComputerButton(){
		return driver.findElement(addNewComputerButton);
	}
	
	public By successMessage  = By.xpath(".//*[@id='main']/div[1]");
	
	public WebElement getSuccessMessage(){
		return driver.findElement(successMessage);
	}
	

}
