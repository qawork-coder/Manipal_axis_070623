package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//table - for starting the table
		//th - table
		//tr - table row
		//td - table Data 
		
		//1. To retrieve the top loosing items symbol
		//2. To Retrieve the LTP value for asianPaint
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/TJ/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nseindia.com/");
		
		
		
	System.out.println(driver.findElement(By.xpath("//*[@id='tab1Loser']/tbody/tr[1]/td[1]/dsdsdsd")).getText());
		
		
	}

}
