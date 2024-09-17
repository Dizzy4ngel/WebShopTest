package eu.michaelclement.page.summary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPageElements {
    @FindBy(xpath = "//td[@data-test-id='firstname']")
    protected WebElement firstName;

    @FindBy(xpath = "//td[@data-test-id='lastname']")
    protected WebElement lastName;

    @FindBy(xpath = "//td[@data-test-id='email']")
    protected WebElement email;

    @FindBy(xpath = "//td[@data-test-id='address-line1']")
    protected WebElement addressLine1;

    @FindBy(xpath = "//td[@data-test-id='address-line2']")
    protected WebElement addressLine2;

    @FindBy(xpath = "//td[@data-test-id='city']")
    protected WebElement city;

    @FindBy(xpath = "//td[@data-test-id='country']")
    protected WebElement country;

    @FindBy(xpath = "//td[@data-test-id='zip']")
    protected WebElement zipCode;
    @FindBy(xpath = "//a[@data-test-id='back-to-checkout']")
    protected WebElement backToCheckoutButton;

    @FindBy(xpath = "//button[@data-test-id='order']")
    protected WebElement orderButton;

    public SummaryPageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
