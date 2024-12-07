package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBpageSignin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();

		 WebElement createNewAccountButton = driver.findElement(By.xpath("//a[@*='open-registration-form-button']"));
		createNewAccountButton.click();
		
		WebElement FirstNameField = driver.findElement( By.name("firstname"));
		FirstNameField .sendKeys("Shweta");
		
		WebElement LastNameField = driver.findElement( By.name("lastname"));
		LastNameField .sendKeys("jadhav");
		
		WebElement Birthdaydatefield = driver.findElement(By.id("day"));
		Select select= new Select(Birthdaydatefield);
		select.selectByVisibleText("5");
		
		WebElement BirthdayMonthfield = driver.findElement(By.id("month"));
		Select select1= new Select(BirthdayMonthfield);
		select1.selectByVisibleText("Dec");
		
		WebElement BirthdayYearfield = driver.findElement(By.id("year"));
		Select select2= new Select(BirthdayYearfield);
		select2.selectByVisibleText("1990");
		
		WebElement FemaleRadioButton=driver.findElement(By.xpath("//input[@name='sex'][@value='1']"));
		FemaleRadioButton.click();
		
		WebElement emailfield = driver.findElement( By.name("reg_email__"));
		emailfield .sendKeys("shweta.hoyar1990@gmail.com");
		
		WebElement passwordfield = driver.findElement( By.name("reg_passwd__"));
		passwordfield .sendKeys("shweta1234");
		
		WebElement SignUpButton=driver.findElement(By.name("websubmit"));
		SignUpButton.click();
		
		
		
		
	}

}
