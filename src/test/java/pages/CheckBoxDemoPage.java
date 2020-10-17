package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CheckBoxDemoPage {
    public CheckBoxDemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Input Forms']")
    public WebElement inputFormsPage;
    @FindBy(linkText = "Checkbox Demo")
    public WebElement checkboxDemoLink;
    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> checkBoxes;
    @FindBy(id = "txtAge")
    public WebElement firstResult;
    @FindBy(id = "check1")
    public WebElement checkBoxResultBox;
}
