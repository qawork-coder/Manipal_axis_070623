package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDAndNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/TJ/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.findElement(By.id("pass")).sendKeys("hmgghj");
		
		driver.findElement(By.name("email")).sendKeys("abc@abc.com");
		

	}

}
