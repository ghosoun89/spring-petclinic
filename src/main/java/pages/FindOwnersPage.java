package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class FindOwnersPage {
	private WebDriver driver;
	private By findOwnerButton = By.cssSelector("[type=\"submit\"]");
	private By ownersNames = By.cssSelector("#owners > tbody > tr > td > a");
	private By addOwnerButton = By.linkText("Add Owner");

	public FindOwnersPage(WebDriver driver){
		this.driver = driver;
	}

	public void clickFindButton(){
		driver.findElement(findOwnerButton).click();
	}

	public AddOwnerPage clickAddOwnerButton(){
		driver.findElement(addOwnerButton).click();
		return new AddOwnerPage(driver);
	}

	public List getOwnersInfo(){
		return driver.findElements(ownersNames);
	}
}
