package eu.michaelclement.page.shoppingcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingCartElements {
    @FindBy(xpath = "//td[@data-test-id='table-product-name']")
    protected List<WebElement> productNames;
    @FindBy(xpath = "//td[@data-test-id='table-total-price']")
    protected List<WebElement> productTotalPrices;
    @FindBy(xpath = "//td[@data-test-id='table-price']")
    protected List<WebElement> productPrices;
    @FindBy(xpath = "//td[@data-test-id='table-quantity']/input")
    protected List<WebElement> productQuantityInputs;
    @FindBy(xpath = "//button[@class='plus-button']")
    protected List<WebElement> productQuantityPlusSigns;
    @FindBy(xpath = "//button[@class='minus-button']")
    protected List<WebElement> productQuantityMinusSigns;
    @FindBy(xpath = "//td[@data-test-id='cart-total-price']")
    protected WebElement totalPrice;
    @FindBy(xpath = "//a[@data-test-id='back-to-products']")
    protected WebElement backToProductsButton;
    @FindBy(xpath = "//button[@data-test-id='checkout']")
    protected WebElement checkoutButton;

    public ShoppingCartElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
