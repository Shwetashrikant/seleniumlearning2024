package com.selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdownUtility {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
				
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dayDD=driver.findElement(By.name("birthday_day"));
		WebElement monthDD=driver.findElement(By.name("birthday_month"));
		WebElement yearDD=driver.findElement(By.name("birthday_year"));
	
		
		//write utility function to handle drop down value of any drop down
		//by using index,value and visible text
		
		//handleSelectDropdownbyusingIndex(dayDD,6);
		//handlesSelectDropdownByUsingIndex(monthDD,5);
		//handleSelectDropdownByusingIndex(yearDD,24);
		
		//handleSelectDropdownByusingvalue(dayDD,3);
		//handleSelectDropdownByusingIndex(monthDD,2);
		//handleSelectDropdownByusingIndex(yearDD,2022);
		
		
		//handleSelect DropdownByusingVisibleText(dayDD,"")		
		
		
	}

}
