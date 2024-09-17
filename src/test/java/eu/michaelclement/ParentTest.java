package eu.michaelclement;

import eu.michaelclement.page.login.LoginPageController;
import eu.michaelclement.util.DriverFactory;
import eu.michaelclement.util.DriverType;
import eu.michaelclement.util.URLs;
import eu.michaelclement.util.UrlReader;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class ParentTest {
    protected WebDriver driver;
    protected LoginPageController loginPage;

    protected SoftAssertions softAssertions;

    protected void openLandingPage(){
//        String url = UrlReader.getUrl(URLs.LOGIN);
//        driver.get(url);
        //ez osszevonva 1 sorba:
        driver.get(UrlReader.getUrl(URLs.LOGIN));
    }

    //a before each azutan van, hogy peldanyosult minden
    @BeforeEach
    public void openLogin() {
        softAssertions = new SoftAssertions();
        driver = DriverFactory.get(DriverType.CHROME);
        loginPage = new LoginPageController(driver);
        openLandingPage();
        //productsPage = new ProductsPageController(driver);
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
        softAssertions.assertAll(); //itt lezarjuk a soft assertet
    }
}
