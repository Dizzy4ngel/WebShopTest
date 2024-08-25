import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
    public static WebDriver get(DriverType type){
        switch (type){
            case CHROME -> {
                return new ChromeDriver();
            }
            case EDGE -> {
                return new EdgeDriver();
            }
            case SAFARI -> {
                return new SafariDriver();
            }
            case FIREFOX -> {
                return new FirefoxDriver();
            }
            default -> throw new NotImplementedWebDriverException();
        }

    }
}
