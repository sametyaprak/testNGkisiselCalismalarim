package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SeleniumEasyInputPage {
    public SeleniumEasyInputPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "at-cv-lightbox-close")
    public WebElement alertClose;
    @FindBy(xpath = "//*[.='Input Forms']")
    public WebElement inputFormsPage;
    @FindBy(linkText = "Simple Form Demo")
    public WebElement simpleFormDemo;
    @FindBy(id = "user-message")
    public WebElement userTexBox;
    @FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
    public WebElement showMessageButton;
    @FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
    public WebElement getTotalButton;
    @FindBy(xpath = "//input[@placeholder='Enter value']")
    public List<WebElement> valueBoxes;
    @FindBy(id = "display")
    public WebElement resultText;
    @FindBy(id = "displayvalue")
    public WebElement resultValue;



}
