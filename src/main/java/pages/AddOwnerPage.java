package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddOwnerPage {
	private WebDriver driver;
	private By firstName = By.id("firstName");
	private By lastName = By.id("lastName");
	private By address = By.id("address");
	private By city = By.id("city");
	private By telephone = By.id("telephone");
	private By addOwnerButton = By.cssSelector("[type=\"submit\"]");
	private By addNewPetLink = By.partialLinkText("New Pet");


	public AddOwnerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void fillOwnerForm(String ownerName, String ownerLastName, String ownerAddress, String ownerCity, String ownerTelephone) {
		driver.findElement(firstName).sendKeys(ownerName);
		driver.findElement(lastName).sendKeys(ownerLastName);
		driver.findElement(address).sendKeys(ownerAddress);
		driver.findElement(city).sendKeys(ownerCity);
		driver.findElement(telephone).sendKeys(ownerTelephone);
		driver.findElement(addOwnerButton).click();
	}

	public AddNewPetPage clickAddNewPetLink() {
		driver.findElement(addNewPetLink).click();
		return new AddNewPetPage(driver);
	}
}

