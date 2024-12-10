package HandleAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uilityfoealert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr603546");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nunYdyg");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		
		handleAlert(driver);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();

		handleAlert(driver);
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr603546");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nunYdyg");
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		handleAlert(driver);
		
		
	}

	 static void handleAlert(WebDriver driver) {
		
		if(isAlertPresent(driver))
		{
			driver.switchTo().alert().accept();	
		}
		else
		{
			System.out.println("Alert is not present on the page hence ignored");
			
		}
		
	 }

	 static boolean isAlertPresent(WebDriver driver) 
	{
		
		try {
		driver.switchTo().alert();
				return true;
	}
	catch(NoAlertPresentException e)
	{
		return false;
		
	}
			
	}	
}
