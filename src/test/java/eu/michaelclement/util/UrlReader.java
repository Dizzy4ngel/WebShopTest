package eu.michaelclement.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UrlReader {
    public static String getUrl(URLs url){
        Properties properties = new Properties();

        //try-with-resources statement -> igy lezarja magat a vegen (mintha egy finally block-ot utana raknank
        try(FileInputStream fileInputStream = new FileInputStream("src/test/resources/urls.properties")){
            properties.load(fileInputStream);
        } catch (IOException e){
            throw new RuntimeException();
        }
        return properties.getProperty(url.getValue());
    }
}
