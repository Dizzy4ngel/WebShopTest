package eu.michaelclement.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//ez egy olyan utiliy class, amit peldanyositunk, nem statikus

public class WaitHelper {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public WaitHelper(WebDriver driver){
       this.wait = new WebDriverWait(driver, Duration.ofMillis(3000));
       this.driver = driver;
    }

    public  void clickElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void fillField(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(text);
    }

    //ez az overload-nak egy felhasznalasa dumplikacio nelkul
    public void fillField(WebElement element, Double text) {
        fillField(element, String.valueOf(text));
    }
    //ez az overload-nak egy felhasznalasa dumplikacio nelkul
    public void fillField(WebElement element, Integer text) {
        fillField(element, String.valueOf(text));
    }

    public String getElementText(WebElement element) {
        wait.until( d -> !element.getText().isEmpty());
        return element.getText();
    }

//    public String getElementValue(WebElement element){
//
//    }
}
