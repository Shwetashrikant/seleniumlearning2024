package com.testng;
  
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	
		public class demo {
			
	    @DataProvider(name = "data") 
	    public Object[][] getData() {
	        return new Object[][]{
	            {"shwet", "Jadhav", "5", "Dec", "1990", "Female", "7620026440", "Shwet@123"},
	            {"shri", "bhoyar", "17", "Dec", "1985", "Male", "9518595819", "svbhoyar@gmail.c"},
	            {"vasu", "armav", "9", "Aug", "1999", "Female", "7000026440", "Vasut@123"},
	            {"jai", "bhutr", "16", "Sep", "1975", "Male", "9511115819", "jair@gmail.c"},
	             
	        };
	    }

	    @Test(dataProvider = "data")
	    public void testFacebookSignUp(String firstName, String lastName,
	                                   String day, String month, String year,
	                                   String gender, String mob, String pass)
	                                		   throws InterruptedException {

	        WebDriver driver = new ChromeDriver();

	        try {
	            driver.get("https://www.facebook.com/");

	            driver.findElement(By.linkText("Create new account")).click();
	            Thread.sleep(2000);

	            driver.findElement(By.name("firstname")).sendKeys(firstName);
	            driver.findElement(By.name("lastname")).sendKeys(lastName);

	            new Select(driver.findElement(By.id("day"))).selectByVisibleText(day);
	            new Select(driver.findElement(By.id("month"))).selectByVisibleText(month);
	            new Select(driver.findElement(By.id("year"))).selectByVisibleText(year);

	            if (gender.equals("Female")) {
	                driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
	            } else if (gender.equals("Male")) {
	                driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
	            } else if(gender.equals("Custom")) {
	                driver.findElement(By.xpath("//label[normalize-space()='Custom']")).click();
	            }

	            driver.findElement(By.name("reg_email__")).sendKeys(mob); 
	            driver.findElement(By.id("password_step_input")).sendKeys(pass); } finally {
//	            driver.quit();
	        }
	    }
	}


