package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @autor: Boris.Perez
 **/
public class Enter {
    public static void text(WebDriver webDriver, By locator, String text){
        webDriver.findElement(locator).sendKeys(text);
    }
}
