package eu.michaelclement.page.header;

import eu.michaelclement.util.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderController extends HeaderElements implements ProductsPageHeader {
    private final WaitHelper waitHelper;


    public HeaderController(WebDriver driver) {
        super(driver);
        waitHelper = new WaitHelper(driver);
    }

    @Override
    public void clickCartIcon() {
        waitHelper.clickElement(cartIcon);
    }

    @Override
    public void clickDummyButton() {
        waitHelper.clickElement(dummyButton);
    }

    @Override
    public void clickProductsButton() {
        waitHelper.clickElement(productsButton);
    }

    @Override
    public void clickContactButton() {
        waitHelper.clickElement(contactButton);
    }

    @Override
    public void clickLogoutButton() {
        waitHelper.clickElement(logoutButton);
    }
}
