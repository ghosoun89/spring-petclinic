package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class OwnerAndPetInfo {
	private WebDriver driver;
	private By newOwnerInfo  = By.cssSelector(".container-fluid > div > table > tbody > tr > td:not([valign='top'])");
	private By newPetInfo = By.cssSelector("table > tbody > tr > td:nth-child(1) > dl > dd");

	public OwnerAndPetInfo(WebDriver driver){
		this.driver = driver;
	}

	public List<String> getNewOwnerInfo(){
		List<WebElement> newOwnerData = driver.findElements(newOwnerInfo);
		return newOwnerData.stream().map(e->e.getText()).collect(Collectors.toList());
	}

	public List<String> getNewPetInfo(){
		List<WebElement> newOwnerData = driver.findElements(newPetInfo);
		return newOwnerData.stream().map(e->e.getText()).collect(Collectors.toList());
	}
}
