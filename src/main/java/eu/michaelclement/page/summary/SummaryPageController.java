package eu.michaelclement.page.summary;

import eu.michaelclement.page.products.ProductsPageController;
import eu.michaelclement.util.WaitHelper;
import org.openqa.selenium.WebDriver;

public class SummaryPageController {
    private final WaitHelper waitHelper;
    private final WebDriver driver;


    public SummaryPageController(WebDriver driver) {
        this.waitHelper = new WaitHelper(driver);
        this.driver = driver;
    }

    public ProductsPageController clickBackToProductsButton(){
        waitHelper.clickElement(backToCheckoutButton);
        return new ProductsPageController(driver);
    }
    //Fixme change return type
    public void clickCheckoutButton(){
        waitHelper.clickElement(orderButton);
        //return ;
    }
}
