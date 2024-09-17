package eu.michaelclement.data;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;

public class Address {
    private final String addressLine1;
    private final String getAddressLine2;
    private final String city;
    private final String zipCode;

    private String country = new ;

    public Address(OrderingUser orderingUser) {
        this.addressLine1 = addressLine1;
        this.getAddressLine2 = getAddressLine2;
        this.city = city;
        this.zipCode = zipCode;
        this.country = AddressCountry.values();
    }
}
