package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;


public class BaseTests {
	private WebDriver driver;
	protected HomePage homePage;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver_linux64 (1)/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/");

		homePage = new HomePage(driver);
	}

	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}
}
