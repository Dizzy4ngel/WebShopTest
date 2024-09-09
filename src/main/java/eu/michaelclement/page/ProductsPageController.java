package eu.michaelclement.page;

import eu.michaelclement.util.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class ProductsPageController extends ProductsPageElements {
    private final WaitHelper waitHelper;
    public ProductsPageController(WebDriver driver) {
        super(driver);
        waitHelper = new WaitHelper(driver);
    }

    public void search(String searchText){
        waitHelper.fillField(searchField, searchText);
    }

    public void filterMinPrice(Double price){
        waitHelper.fillField(minPriceField, price);
    }

//    public void printListSize(){
//        System.out.println(productTitles.size());
//    }

//    public void printTitles(){
//        for(WebElement element: productTitles){
//            System.out.println(element.getText());
//        }
//    }
}
