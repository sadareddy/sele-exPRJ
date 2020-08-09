import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	
	
	public WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void testCase1() {
		
		driver.get("http://gmail.com");
		
	}

	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
}
