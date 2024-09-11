package eu.michaelclement;

import eu.michaelclement.data.User;
import eu.michaelclement.data.UserFactory;
import eu.michaelclement.data.UserType;
import eu.michaelclement.page.LoginPageController;
import eu.michaelclement.util.DriverFactory;
import eu.michaelclement.util.DriverType;
import eu.michaelclement.util.URLs;
import eu.michaelclement.util.UrlReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class ParentTest {
    protected WebDriver driver;
    protected LoginPageController loginPage;

    protected void openLandingPage(){
//        String url = UrlReader.getUrl(URLs.LOGIN);
//        driver.get(url);
        //ez osszevonva 1 sorba:
        driver.get(UrlReader.getUrl(URLs.LOGIN));
    }

    @BeforeEach
    public void openLogin() {
        driver = DriverFactory.get(DriverType.CHROME);
        loginPage = new LoginPageController(driver);
        //productsPage = new ProductsPageController(driver);
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
