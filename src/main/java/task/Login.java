package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginUI;

/**
 * @autor: Boris.Perez
 **/
public class Login {

    public static void as(WebDriver driver, String user, String passWord){
        Enter.text(driver, LoginUI.userInput, user);
        Enter.text(driver, LoginUI.passWordInput, passWord);
        Click.on(driver,LoginUI.loginButton);
    }


}
