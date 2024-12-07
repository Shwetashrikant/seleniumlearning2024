package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnCssSelector {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("Shweta.bhoyar1990@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Shweta1990");
		
		System.out.println(driver.findElement(By.cssSelector("._8eso")) .getText());
		System.out.println(driver.findElement(By.cssSelector("#ref_pages_msg")) .getText());

		driver.quit();
		
		}

}