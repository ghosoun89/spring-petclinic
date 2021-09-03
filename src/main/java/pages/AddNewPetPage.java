package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddNewPetPage {
	private WebDriver driver;
	private By petName = By.id("name");
	private By birthDate = By.id("birthDate");
	private By dropDown = By.id("type");
	private By addPetButton = By.cssSelector("[type=\"submit\"]");

	public AddNewPetPage(WebDriver driver){
		this.driver = driver;
	}

	public void addNewPetInfo(String name, String date, String option){
		driver.findElement(petName).sendKeys(name);
		driver.findElement(birthDate).sendKeys(date);
		selectFromDropDown(option);
	}

	public void selectFromDropDown(String option){
		Select dropdownElement = new Select(driver.findElement(dropDown));
		dropdownElement.selectByVisibleText(option);
	}

	public OwnerAndPetInfo clickAddPetButton(){
		driver.findElement(addPetButton).click();
		return new OwnerAndPetInfo(driver);
	}
}
