package eu.michaelclement.util;

import com.github.javafaker.Faker;

import javax.swing.plaf.PanelUI;
import java.util.Locale;

public class OrderingUserFactory {
    private static final Faker FAKER =new Faker(Locale.US);

    public static OrderingUser getRandom(){
        return new OrderingUser(
                FAKER.name().firstname()
        );
    }
}
