package eu.michaelclement.page.shoppingcart;

import eu.michaelclement.page.products.ProductsPageController;
import eu.michaelclement.util.WaitHelper;
import org.openqa.selenium.WebDriver;

import java.lang.module.FindException;

public class ShoppingCartController extends ShoppingCartElements {
    private final WaitHelper waitHelper;

    private final WebDriver driver;
    public ShoppingCartController(WebDriver driver) {
        super(driver);
        this.waitHelper = new WaitHelper(driver);
        this.driver = driver;
    }

    public ShoppingCartController clickMinusSign(int index){
        waitHelper.clickElement(productQuantityMinusSigns.get(index-1));
        return this;
    }

    public ShoppingCartController clickPlusSign(int index){
        waitHelper.clickElement(productQuantityPlusSigns.get(index-1));
        return this;
    }

    public ShoppingCartController setQuantity(int index, int quantity){
        waitHelper.fillField(productQuantityInputs.get(index-1), quantity);
        return this;
    }

    public ProductsPageController clickBackToProductsButton(){
        waitHelper.clickElement(backToProductsButton);
        return new ProductsPageController(driver);
    }
    //Fixme change return type
    public void clickCheckoutButton(){
        waitHelper.clickElement(checkoutButton);
        //return new CheckoutPageController();
    }


}
