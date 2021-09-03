package owner;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddNewPetPage;
import pages.TestOwnerData;
import pages.AddOwnerPage;
import pages.FindOwnersPage;
import pages.OwnerAndPetInfo;

import java.util.Arrays;
import java.util.List;

public class OwnerTests extends BaseTests {
	@Test
	public void testGetAllOwners() {
		FindOwnersPage findOwnersPage = homePage.clickFindOwnersLink();
		findOwnersPage.clickFindButton();
		List<WebElement> ownersList = findOwnersPage.getOwnersInfo();
		System.out.println("Owners Name :" + "\n");
		for (WebElement name : ownersList) {
			System.out.println(name.getText());
		}
	}

	@Test
	public void testAddNewOwnerAndPet() {
		TestOwnerData testOwnerData = new TestOwnerData("QA", "tester", "Macca Street", "Amman", "077777777");
		String ownerName = testOwnerData.getFirstName();
		String ownerLastName = testOwnerData.getLastName();
		String ownerAddress = testOwnerData.getAddress();
		String ownerCity = testOwnerData.getCity();
		String ownerPhone = testOwnerData.getPhone();
		List<String> newPetrData = Arrays.asList("Sasha", "2020-01-01", "dog");

		FindOwnersPage findOwnersPage = homePage.clickFindOwnersLink();
		AddOwnerPage addOwnerPage = findOwnersPage.clickAddOwnerButton();
		addOwnerPage.fillOwnerForm(ownerName, ownerLastName, ownerAddress, ownerCity, ownerPhone);
		List<String> ownerDataToVerify = testOwnerData.getAllInfo();
		AddNewPetPage addNewPetPage = addOwnerPage.clickAddNewPetLink();
		addNewPetPage.addNewPetInfo(newPetrData.get(0), newPetrData.get(1), newPetrData.get(2));
		OwnerAndPetInfo ownerAndPetInfo = addNewPetPage.clickAddPetButton();
		List<String> ownerData = ownerAndPetInfo.getNewOwnerInfo();
		List<String> petData = ownerAndPetInfo.getNewPetInfo();
		Assert.assertEquals(ownerDataToVerify, ownerData);
		Assert.assertEquals(newPetrData, petData);
	}
}
