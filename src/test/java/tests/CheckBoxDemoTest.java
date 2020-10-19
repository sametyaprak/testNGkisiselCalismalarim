package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckBoxDemoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBase;

public class CheckBoxDemoTest extends TestBase {
    CheckBoxDemoPage page = new CheckBoxDemoPage();
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("seleniumEasy"));
    }
    @Test
    public void test(){
        page.inputFormsPage.click();
        page.checkboxDemoLink.click();
        ReusableMethods.waitFor(1);
        page.checkBoxes.get(0).click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(page.firstResult.isDisplayed());
        //Assert.assertEquals(page.checkBoxResultBox.getCssValue("value"),"Check");
        for (WebElement w: page.checkBoxes) {
            w.click();
        }
        Assert.assertEquals(page.checkBoxResultBox.getAttribute("value"),"Uncheck All");
        page.checkBoxResultBox.click();
        Assert.assertEquals(page.checkBoxResultBox.getAttribute("value"),"Check All");
    }
}
