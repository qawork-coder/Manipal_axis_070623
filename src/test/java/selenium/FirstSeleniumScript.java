package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TJ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//webdriver.chrome.driver - the type of driver that we want to launch 
		//path - the path to the driver
		
		WebDriver driver = new ChromeDriver();
		//WebDriver - Interface 
		//ChromeDriver - a class
		// chromeDriver is implementing the methods of the interface
	
		
		driver.get("https://www.amazon.in");
		
		//get - WebDriver Interface 
		// get method body is defined by chromeDriver Interface
		
		

	}

}
