package HandleAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uilityfoealert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr603546");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nunYdyg");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		
		if ()
		
	}

}
