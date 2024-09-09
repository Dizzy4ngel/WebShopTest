package eu.michaelclement.page;

import eu.michaelclement.util.WaitHelper;
import org.openqa.selenium.WebDriver;

public class LoginPageController extends LoginPageElements {
    private final WaitHelper waitHelper;

    public LoginPageController(WebDriver driver) {
        super(driver);
        this.waitHelper = new WaitHelper(driver);
    }

    public void fillUsernameField(String username){
        waitHelper.fillField(usernameField, username);
    }

    public void fillPasswordField(String password){
        waitHelper.fillField(passwordField, password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
