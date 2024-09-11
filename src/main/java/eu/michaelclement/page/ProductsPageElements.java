package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPageElements {
    @FindBy(xpath = "//input[@id='product-search']")
    protected WebElement searchField;
    @FindBy(xpath = "//select[@id='sort-by]")
    protected WebElement sortDropdown;
    @FindBy(xpath = "//input[@id='min-price']")
    protected WebElement minPriceField;
    @FindBy(xpath = "//input[@id='max-price']")
    protected WebElement maxPriceField;
    @FindBy(xpath = "//option[@value='name']")
    protected WebElement sortOptionName;
    @FindBy(xpath = "//option[@value='price']")
    protected WebElement sortOptionPrice;

    @FindBy(xpath = "//h3")
    protected List<WebElement> productTitles;
    @FindBy(xpath = "//div[@data-product-id]/p/[1]")
    protected List<WebElement> productDescriptions;
    @FindBy(xpath = "//div[@data-product-id]/p/[2]")
    protected List<WebElement> productPrices;
    @FindBy(xpath = "//div[@class='product-quantity']/input")
    protected List<WebElement> productQuantityInputs;
    @FindBy(xpath = "//button[@class='plus-button']")
    protected List<WebElement> productQuantityPlusSigns;
    @FindBy(xpath = "//button[@class='minus-button']")
    protected List<WebElement> productQuantityMinusSigns;
    public ProductsPageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
