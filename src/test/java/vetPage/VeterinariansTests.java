package vetPage;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.VetPage;

import java.util.List;

public class VeterinariansTests extends BaseTests {
	@Test
	public void testVetsList() {
		VetPage vetPage = homePage.clickVetLink();
		List<WebElement> vetsList = vetPage.getVets();
		System.out.println("Vets Name :" + "\n");
		for (WebElement vet : vetsList) {
			System.out.println(vet.getText());
		}

	}
}
