package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SimpleFormDemoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBase;

public class SimpleFormDemo extends TestBase {

    SimpleFormDemoPage page = new SimpleFormDemoPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void tc001(){
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
