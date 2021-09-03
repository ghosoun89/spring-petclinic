package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class VetPage {
	private WebDriver driver;
	private By veterinarians = By.cssSelector("#vets > tbody > tr > td:nth-child(1)");

	public VetPage(WebDriver driver) {
		this.driver = driver;
	}

	public List getVets() {
		return driver.findElements(veterinarians);
	}
}
