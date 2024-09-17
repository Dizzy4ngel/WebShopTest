package eu.michaelclement;

import eu.michaelclement.data.User;
import eu.michaelclement.data.UserFactory;
import eu.michaelclement.data.UserType;
import eu.michaelclement.page.login.LoginPageController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest extends ParentTest{
    private WebDriver driver;

    private LoginPageController loginPage;


    //private TestContext testContext = new TestContext();

    @Test
    User user = new User("practiceUser", "practicePass");

            loginPage.login(UserFactory.get(UserType.VALID_USER));

//        int i = 1;
//        productsPage.clickNthPlusButton(i);
//        testContext.setProductTitle(productsPage.getNthProductTitle(i));

        Assertions.assertEquals("https://www.michaelclement.eu/practice-webshop-products/", driver.getCurrentUrl());
    }


    }
}
