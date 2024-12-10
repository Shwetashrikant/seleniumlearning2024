package HandleAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GURU99alert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr603546");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nunYdyg");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		
		
		
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		
		
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shweta");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		
		
		Alert alert1 =driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
	}
		
		
		
	

}
