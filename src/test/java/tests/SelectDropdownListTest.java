package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SelectDropdownListPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBase;

import javax.swing.*;

public class SelectDropdownListTest extends TestBase {
    SelectDropdownListPage page = new SelectDropdownListPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test1() {
        page.inputFormsPage.click();
        ReusableMethods.waitFor(1);
        page.dropdownLink.click();
        Select options = new Select(page.firstDropdown);
        for (int i = 0; i < 8; i++) {
            options.selectByIndex(i);
            System.out.println(page.firstDropdownResult.getText());
        }
        Select options2 = new Select(page.secondDropdown);
        for (int i = 0; i < 8; i++) {
            options2.selectByIndex(i);
            page.fristSelectedButton.click();
            System.out.println(page.resultText2.getText());
        }
        ReusableMethods.waitFor(3);
        for(int i=9;i<17;i++){
            actions.clickAndHold(Driver.getDriver().findElement(By.xpath("(//option)["+i+"]"))).perform();
            for(int j=9;j<17;j++){
                if(i!=j){
                    Driver.getDriver().findElement(By.xpath("(//option)["+j+"]")).click();
                    page.getAllSelectedButton.click();
                    System.out.println(page.resultText2.getText());
                }

            }
            actions.release().perform();
        }
    }
}

