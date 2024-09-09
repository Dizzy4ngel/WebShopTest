import eu.michaelclement.util.DriverFactory;
import eu.michaelclement.util.DriverType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebShopTest {
    private WebDriver driver;
    private LoginPageFactory loginPage;
    private HeaderPageFactory headerPage;
    private ProductPageFactory productPage;

    @Test
    public void testValidLoginAndLogout() {

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(6000)); //igy 10000 ms-et fog varni, mert masodszor is eliundul az implicitWait

        //long polling = 2000;
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000), Duration.ofMillis(polling));

        driver.get("https://www.michaelclement.eu/practice-webshop-login/");

       // wait.until(d -> d.findElement(By.xpath("//input[@id='username']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']")));



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        loginPage.fillUsernameField("practiceUser");
        loginPage.fillPasswordField("practicePass");
        loginPage.clickLoginButton();

        wait.until(ExpectedConditions.urlToBe("https://www.michaelclement.eu/practice-webshop-products/"));

        headerPage.clickLogoutButton();
        Assertions.assertEquals("https://www.michaelclement.eu/practice-webshop-login/", driver.getCurrentUrl());
    }
    @Test
    public void testValidLoginAndFailedLogout() {
        validLogin();
        Assertions.assertEquals("https://www.michaelclement.eu/practice-webshop-products/", driver.getCurrentUrl());
        //assert-alom a sikeres logint, hogy lassan, hogy a vegen azert NEM vagyok a products oldalon
        //mert mar a bejelentkezes SEM sikerult
        headerPage.clickLogoutButton();
        Assertions.assertEquals("https://www.michaelclement.eu/practice-webshop-products/", driver.getCurrentUrl());
    }

    @Test
    public void testContactButton(){
        validLogin();
        headerPage.clickContactButton();
        Assertions.assertEquals("https://www.michaelclement.eu/practice-webshop-contact/", driver.getCurrentUrl());
    }

    @Test
    public void testDummyButtons(){
        validLogin();
        headerPage.clickDummyButton();
        Assertions.assertEquals("https://www.michaelclement.eu/practice-webshop-dummy/", driver.getCurrentUrl());
    }

    @Test
    public void testProductButtons(){
        validLogin();
        headerPage.clickContactButton();
        headerPage.clickProductsButton();
        Assertions.assertEquals("https://www.michaelclement.eu/practice-webshop-products/", driver.getCurrentUrl());
    }

    @Test
    public void testCartIcon(){
        validLogin();
        headerPage.clickCartIcon();
        Assertions.assertEquals("https://www.michaelclement.eu/practice-webshop-shopping-cart/", driver.getCurrentUrl());
    }

    @Test
    public void testProductToCart(){
       validLogin();
        productPage.clickCapPlusButton();
        headerPage.clickCartIcon();
        Assertions.assertEquals("https://www.michaelclement.eu/practice-webshop-shopping-cart/", driver.getCurrentUrl());
        //ToDo
        //itt lenne meg tobb assertion, hogy az egyes mezokben mi latszik
        //ehhez meg kellene irni a CartPageFactory-t is
    }

    @BeforeEach
    public void openLogin(){
        driver = DriverFactory.get(DriverType.CHROME);
        loginPage = new LoginPageFactory(driver);
        driver.manage().window().maximize();
    }

    @BeforeEach
    public void openHomePage(){
        headerPage = new HeaderPageFactory(driver);
        productPage = new ProductPageFactory(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    public void validLogin(){
        driver.get("https://www.michaelclement.eu/practice-webshop-login/");
        loginPage.fillUsernameField("practiceUser");
        loginPage.fillPasswordField("practicePass");
        loginPage.clickLoginButton();
    }
}
