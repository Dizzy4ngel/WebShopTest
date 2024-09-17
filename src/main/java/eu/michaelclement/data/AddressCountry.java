package eu.michaelclement.data;

public enum AddressCountry {
    HUNGARY("Hungary"),
    AUSTRIA("Austria"),
    SLOVAKIA("Slovakia"),
    CROATIA("Croatia");

    private final String value;

    AddressCountry(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}


