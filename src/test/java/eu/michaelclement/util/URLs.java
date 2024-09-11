package eu.michaelclement.util;

public enum URLs {
    LOGIN("login"),
    CART("cart"),
    PRODUCTS("products"),
    ;

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
