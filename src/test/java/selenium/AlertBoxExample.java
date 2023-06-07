package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {
	
	public static void main(String args[])
	{
		
	System.setProperty("webdriver.chrome.driver", "C:/Users/TJ/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	//Alert class for handling the alerts 
	
	driver.findElement(By.name("submit")).click();
	
	Alert obj=driver.switchTo().alert();
	
	obj.accept();
	
	System.out.println(obj.getText());
	
	obj.dismiss();

	}
}
