package pages;

import freemarker.template.Template;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RadioButtonsDemoPage {
    public RadioButtonsDemoPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Input Forms']")
    public WebElement inputFormsPage;
    @FindBy(linkText = "Radio Buttons Demo")
    public WebElement radioButtonsDemoLink;
    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> allRadioButtons;
    @FindBy(xpath = "//p[@class='groupradiobutton']")
    public WebElement results;
    @FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
    public WebElement getResultsButton;
}
