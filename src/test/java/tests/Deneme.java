package tests;

import org.testng.annotations.Test;
import utilities.Driver;

public class Deneme {

    @Test
    public void deneme(){
        Driver.getDriver().get("https://www.google.de/");
    }
}
