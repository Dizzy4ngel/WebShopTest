package eu.michaelclement.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
    public static WebDriver get(DriverType type){
       // WebDriver driver;
        switch (type){
            case DriverType.CHROME -> {
                return new ChromeDriver();
                //driver = new ChromeDriver();
            }
            case DriverType.EDGE -> {
                return new EdgeDriver();
                //driver = new EdgeDriver();
            }
            case DriverType.SAFARI -> {
                return new SafariDriver();
                //driver = new SafariDriver();
            }
            case DriverType.FIREFOX -> {
                return new FirefoxDriver();
                //driver = new FirefoxDriver();
            }
            default -> throw new NotImplementedWebDriverException();
        }

        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        //return driver;
    }
}
