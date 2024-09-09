import eu.michaelclement.util.WaitHelper;
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

//    private final WebDriver driver;

    private final WaitHelper waitHelper;

    public LoginPageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.waitHelper = new WaitHelper(driver);
       // this.driver = driver;
    }

    public void fillUsernameField(String username){
       waitHelper.fillField(usernameField, "text");

       // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        usernameField.sendKeys(username);
       // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(0));
    }

    public void fillPasswordField(String password){
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
