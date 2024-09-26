package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	private By vetLink = By.cssSelector("[title='veterinarians']");
	private By homePageImage = By.className("img-responsive");
	private  By findOwnersLink = By.cssSelector("[title=\"find owners\"]");

	private WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver = driver;
	}

	public VetPage clickVetLink(){
	driver.findElement(vetLink).click();
	return new VetPage(driver);
	}

	public WebElement getImage(){
		return driver.findElement(homePageImage);
	}

	public FindOwnersPage clickFindOwnersLink(){
		driver.findElement(findOwnersLink).click();
		return new FindOwnersPage(driver);
	}
}
