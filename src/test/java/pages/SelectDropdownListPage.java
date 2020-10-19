package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SelectDropdownListPage {
    public SelectDropdownListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Input Forms']")
    public WebElement inputFormsPage;
    @FindBy(linkText = "Select Dropdown List")
    public WebElement dropdownLink;
    @FindBy(id = "select-demo")
    public WebElement firstDropdown;
    @FindBy(xpath = "//p[@class='selected-value']")
    public WebElement firstDropdownResult;
    @FindBy(id = "multi-select")
    public WebElement secondDropdown;
    @FindBy(id = "printMe")
    public WebElement fristSelectedButton;
    @FindBy(xpath = "//p[@class='getall-selected']")
    public WebElement resultText2;
    @FindBy(id = "printAll")
    public WebElement getAllSelectedButton;

}
