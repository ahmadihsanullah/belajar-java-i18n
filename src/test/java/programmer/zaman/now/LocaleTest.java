package programmer.zaman.now;

import java.util.Locale;

import org.junit.jupiter.api.Test;

public class LocaleTest {
    
    @Test
    void testLocale(){
        String language = "id";
        String country = "ID";
        var locale = Locale.of(language,country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }

    @Test
    void testLocaleUs(){
        String language = "en";
        String country = "Us";
        var locale = Locale.of(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
}
