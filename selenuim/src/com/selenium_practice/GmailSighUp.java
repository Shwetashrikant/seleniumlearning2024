package com.selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSighUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		
		driver.manage().window().maximize();
		
		WebElement FirstNameField = driver.findElement( By.name("firstname"));
		FirstNameField .sendKeys("Shweta");
		
		WebElement LastNameField = driver.findElement( By.name("lastname"));
		LastNameField .sendKeys("jadhav");
		
		WebElement NextButton=driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
		NextButton.click();

	}

}
