package tests;

import org.testng.annotations.Test;
import pages.RadioButtonsDemoPage;
import utilities.TestBase;

import java.util.HashSet;
import java.util.Set;

public class RadioButtons extends TestBase {
    RadioButtonsDemoPage page = new RadioButtonsDemoPage();
    @Test
    public void test(){
        Set<String> myResults = new HashSet<>();
        page.inputFormsPage.click();
        page.radioButtonsDemoLink.click();
        for(int i=2;i<4;i++){
            page.allRadioButtons.get(i).click();
            for(int j=4;j<7;j++){
                page.allRadioButtons.get(j).click();
                page.getResultsButton.click();
                myResults.add(page.results.getText());
                System.out.println(page.results.getText());
            }
        }
    }
}
