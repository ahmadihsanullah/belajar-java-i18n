package programmer.zaman.now;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class ResourceBundleTest {

    @Test
    void testResourceBundle(){
        var resourceBundle = ResourceBundle.getBundle("message");
        
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleIndonesia(){
        Locale indonesia = Locale.of("in","ID");
        var resourceBundle = ResourceBundle.getBundle("message", indonesia);
        
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleNotFound(){
        Locale us = new Locale("en","US");
        var resourceBundle = ResourceBundle.getBundle("message", us);
        
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleMultipleTimes(){
        var resourceBundle1 = ResourceBundle.getBundle("message");
        
        var resourceBundle2 = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle1 == resourceBundle2); //sama di memori
        
    }
}
