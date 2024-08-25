import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPageFactory {
    @FindBy(xpath="//button[@id='products-menu-button']")
    private WebElement productsButton;
    @FindBy(xpath = "//button[@id='contact-menu-button']")
    private WebElement contactButton;
    @FindBy(xpath = "//button[@id='dummy-menu-button']")
    private WebElement dummyButton;
    @FindBy(xpath = "//button[@id='logout-menu-button']")
    private WebElement logoutButton;
    @FindBy(xpath = "//i[@class='cart-icon fas fa-shopping-cart']")
    private WebElement cartIcon;

    public HeaderPageFactory(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickProductsButton(){
        productsButton.click();
    }

    public void clickContactButton(){
        contactButton.click();
    }

    public void clickDummyButton(){
        dummyButton.click();
    }

    public void clickLogoutButton(){
        logoutButton.click();
    }

    public void clickCartIcon(){
        cartIcon.click();
    }

}
