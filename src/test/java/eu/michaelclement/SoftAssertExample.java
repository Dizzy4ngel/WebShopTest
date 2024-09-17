package eu.michaelclement;

import eu.michaelclement.data.UserFactory;
import eu.michaelclement.data.UserType;
import eu.michaelclement.page.header.AdminHeader;
import eu.michaelclement.page.header.HeaderController;
import eu.michaelclement.page.header.ProductsPageHeader;
import eu.michaelclement.page.header.WebshopHeader;
import eu.michaelclement.page.products.ProductsPageController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SoftAssertExample extends ParentTest {
    private ProductsPageController productsPageController;



    @Test
    public void testSoftAssert(){
        loginPage.login(UserFactory.get(UserType.VALID_USER));
        softAssertions.assertThat(productsPageController.getNthProductTitle(1)).isEqualTo("Failed1");
        softAssertions.assertThat(productsPageController.getNthProductTitle(2)).isEqualTo("Failed2");

        AdminHeader adminHeader = new HeaderController(driver);

        ProductsPageHeader productsPageHeader = new HeaderController(driver);

        WebshopHeader webshopHeader = new HeaderController(driver);

    }

    @BeforeEach
    public void setUp(){
        this.productsPageController = new ProductsPageController(driver); //ez kell ahhoz, hogy legyen mar driver inicializalva, amikor megy a test
    }

}
