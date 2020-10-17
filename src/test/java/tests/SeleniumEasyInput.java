package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SeleniumEasyInputPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBase;

public class SeleniumEasyInput extends TestBase {
    SeleniumEasyInputPage page = new SeleniumEasyInputPage();
    Actions actions = new Actions(Driver.getDriver());
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("seleniumEasy"));
    }
    @Test
    public void tc001(){
        waitForVisibility(page.alertClose,10);
        page.alertClose.click();
        page.inputFormsPage.click();
        waitFor(1);
        page.simpleFormDemo.click();
        String testData = ReusableMethods.randomStringData(10);
        page.userTexBox.sendKeys(testData);
        page.showMessageButton.click();
        Assert.assertEquals(page.resultText.getText(),testData);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        int a = (int)ReusableMethods.randomLongData(0,999);
        int b = (int)ReusableMethods.randomLongData(0,999);
        String aa = String.valueOf(a);
        String bb =String.valueOf(b);
        page.valueBoxes.get(0).sendKeys(aa);
        page.valueBoxes.get(1).sendKeys(bb);
        page.getTotalButton.click();
        Assert.assertEquals(page.resultValue.getText(),String.valueOf(a+b));
    }
}
