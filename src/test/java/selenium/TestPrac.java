package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestPrac {

	@Test
	public void launchFB() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		
		WebDriver driver =new RemoteWebDriver(new URL("http://192.168.56.1:4444"),dc);
		driver.get("https://www.fb.com");
		
	}
}
