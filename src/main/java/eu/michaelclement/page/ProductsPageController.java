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
    public void filterMaxPrice(Double price){
        waitHelper.fillField(maxPriceField, price);
    }

    public void sort(SortOption sortOption){
        waitHelper.clickElement(sortDropdown);
        switch (sortOption){
            case PRICE -> {
                waitHelper.clickElement(sortOptionPrice);
            }
            case NAME -> {
                waitHelper.clickElement(sortOptionName);
            }
        }
    }

    /**
     *
     * @param index 1
     */
    //fluent API
    public ProductsPageController clickNthPlusButton(Integer index){
        waitHelper.clickElement(productQuantityPlusSigns.get(index - 1));
        return this;
    }
    public ProductsPageController clickNthMinusButton(Integer index){
        waitHelper.clickElement(productQuantityMinusSigns.get(index - 1));
        return this;
    }

    public ProductsPageController fillNthProductQuantity(Integer index, Integer quantity){
        waitHelper.fillField(productQuantityInputs.get(index - 1), quantity);
        return this;
    }

    public String getNthProductTitle(Integer index) {
        return waitHelper.getElementText(productTitles.get(index - 1));
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
