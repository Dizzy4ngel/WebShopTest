package eu.michaelclement;

import eu.michaelclement.data.OrderedProduct;
import eu.michaelclement.data.User;
import eu.michaelclement.data.UserFactory;
import eu.michaelclement.data.UserType;
import eu.michaelclement.page.ProductsPageController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductsTest extends ParentTest{
    private ProductsPageController productsPage;

    @Test
    public void putThreeMugsInCart(){
        openLandingPage();

        //a record-bol hasznalom, a User egy record
//        User user = new User("practiceUser", "practicePass");
//        User user1 = new User("practiceU", "practicePass");

        //van a record-ban beepitett equals
        //Assertions.assertEquals(user, user1);

        //ez egy beepitett getter
//        user.username();
//        user.password();

        loginPage.login(UserFactory.get(UserType.VALID_USER));

        OrderedProduct expectedOrderedProduct = new OrderedProduct("Michaels's Cap", 5, 15);

//        productsPage
//                .clickNthPlusButton(1)
//                .clickNthPlusButton(1)
//                .clickNthPlusButton(1)
//                .clickNthPlusButton(1)
//                .clickNthPlusButton(1);

                //.fillNthProductQuantity(3, 7);
        sleep();

        //Order actualOrder = new Order(summaryPage.getOrder());
        //ez visszaad egy ordert, amit osszehasonlitunk az expected orderrel

        //OrderedProduct actualOrderedProduct = summaryPage.getNthOrderedProduct(1);
        //most kimockoljuk magunknak
        OrderedProduct actualOrderedProduct = new OrderedProduct("Michaels's Cap", 5, 15);

        Assertions.assertEquals(expectedOrderedProduct, actualOrderedProduct);
    }

    @BeforeEach
    public void setUpControllers(){
        productsPage = new ProductsPageController(driver);
    }

    private void sleep(){
        try{
            Thread.sleep(1500);
        } catch (InterruptedException ignored){}
}
}
