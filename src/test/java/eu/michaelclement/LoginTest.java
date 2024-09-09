package eu.michaelclement;

import eu.michaelclement.page.LoginPageController;
import eu.michaelclement.page.ProductsPageController;
import eu.michaelclement.util.DriverFactory;
import eu.michaelclement.util.DriverType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {
    private WebDriver driver;
    private LoginPageController loginPage;
    //private ProductsPageController productsPage;
    @Test
    public void testValidLogin(){
        driver.get("https://www.michaelclement.eu/practice-webshop-login/");
        loginPage.fillUsernameField("practiceUser");
        loginPage.fillPasswordField("practicePass");
        loginPage.clickLoginButton();

        Assertions.assertEquals("https://www.michaelclement.eu/practice-webshop-products/", driver.getCurrentUrl());
    }

    @BeforeEach
    public void openLogin(){
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
