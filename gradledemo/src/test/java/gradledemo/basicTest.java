package gradledemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basicTest {

	@Test
	public void key()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1214/Desktop/selenium12/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("https://in.linkedin.com/");
	}
}
