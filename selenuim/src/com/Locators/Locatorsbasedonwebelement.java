package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsbasedonwebelement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement username_txt = driver.findElement(By.name("email"));
		WebElement password_txt = driver.findElement(By.name("pass"));
		
		
		username_txt.sendKeys("shweta@facebook.com");
		password_txt.sendKeys("12324536354#$#@");
		
		username_txt.clear();
		password_txt.clear();
		
		username_txt.sendKeys("sv@gmail.com");
		password_txt.sendKeys("shri@123$");
		
		driver.findElement(By.name("login")).click();

	}

}
