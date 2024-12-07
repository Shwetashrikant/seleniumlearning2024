package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsbasedonXpath {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//Locate based on complete x-path
//		driver.findElement(By.xpath
//				("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).
//		sendKeys("vasant@facebook.com");
//		
//		driver.findElement(By.xpath
//				("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).
//		sendKeys("vasant@1234#");
		
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		
		// partial x-path or relative x-path
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shwetab@facebook.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("shree1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
		//driver.quit();
	}

}
