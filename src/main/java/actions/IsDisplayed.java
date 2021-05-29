package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @autor: Boris.Perez
 **/
public class IsDisplayed {
    public static boolean element (WebDriver webDriver, By locator){
        return webDriver.findElement(locator).isDisplayed();
    }
}
