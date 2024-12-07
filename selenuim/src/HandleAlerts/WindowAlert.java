package HandleAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		System.out.println(driver.getTitle() +"    "+ driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Alert alert =driver.switchTo().alert();
		
		alert.accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();	
				
				alert=driver.switchTo().alert();
				System.out.println(alert.getText());
				
				alert.accept();
				System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
				
		
				Thread.sleep(2000);
		
				driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();	
				
				alert=driver.switchTo().alert();
				System.out.println(alert.getText());
				
				alert.sendKeys("hi welcome");
				alert.accept();
				
				System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
				driver.findElement(By.linkText("Elemental Selenium")).click();
				
		
				Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().accept(): 
		//driver.switchTo().alert().dismiss(): 
		//driver.switchTo().alert().getText(): Captures the alert message
		//driver.switchTo().alert().sendKeys(String stringToSend): Sends data to the alert box 

	}

}
