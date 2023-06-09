package org.Manipal.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Prac;


public class BaseConfigurations extends Prac {

	
	public WebDriver getDriver(String Port) throws MalformedURLException {

//		System.setProperty("webdriver.chrome.driver", "C:/Users/TJ/Downloads/chromedriver_win32/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriver driver;
		driver=setUp(Port);
		return driver;

	}

}
