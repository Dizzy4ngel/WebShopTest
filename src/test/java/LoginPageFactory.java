import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

    @FindBy(xpath="//input[@id='username']")
    private WebElement usernameField;
    @FindBy(xpath="//input[@id='password']")
    private WebElement passwordField;
    @FindBy(xpath="//button[@type='submit']")
    private WebElement loginButton;

    //INICIALIZALNI KELL AZ ELEMEKET
    public LoginPageFactory(WebDriver driver) {
//        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillUsernameField(String username){
        usernameField.sendKeys(username);
    }

    public void fillPasswordField(String password){
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
