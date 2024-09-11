package eu.michaelclement.page;

import eu.michaelclement.data.User;
import eu.michaelclement.util.WaitHelper;
import org.openqa.selenium.WebDriver;

public class LoginPageController extends LoginPageElements {
    private final WaitHelper waitHelper;

    public LoginPageController(WebDriver driver) {
        super(driver);
        this.waitHelper = new WaitHelper(driver);
    }

    public void login(User user){
        fillUsernameField(user.username());
        fillPasswordField(user.password());
        clickLoginButton();
    }
    private void fillUsernameField(String username){
        waitHelper.fillField(usernameField, username);
    }

    private void fillPasswordField(String password){
        waitHelper.fillField(passwordField, password);
    }

    private void clickLoginButton(){
        loginButton.click();
    }
}
