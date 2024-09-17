package eu.michaelclement.util;

import eu.michaelclement.data.Address;
import eu.michaelclement.data.AddressCountry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AddressFactory {
    public static AddressCountry get(AddressCountry type){
        switch (type){
            case AUSTRIA -> {
                return AddressCountry.AUSTRIA;
            }
            case CROATIA -> {
                return AddressCountry.CROATIA;
            }
            case HUNGARY -> {
                return AddressCountry.HUNGARY;
            }
            case SLOVAKIA -> {
                return AddressCountry.SLOVAKIA;
            }
            default -> throw new NotImplementedCountryException();
        }
    }

}
