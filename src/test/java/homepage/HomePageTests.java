package homepage;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTests {
	@Test
	public void testVisibilityOfImage(){
		WebElement homePageImage = homePage.getImage();
		Assert.assertEquals(true, homePageImage.isDisplayed());
	}
}
