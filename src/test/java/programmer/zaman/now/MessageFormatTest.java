package programmer.zaman.now;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class MessageFormatTest {
    @Test
  void testMessageFormat() {

    var pattern = "Hi {0}, Anda bisa mencari data Anda dengan mengetikkan \"{0}\" di pencarian.";
    var messageFormat = new MessageFormat(pattern);

    var format = messageFormat.format(new Object[]{
        "Eko"
    });

    System.out.println(format);

  }


  @Test
  void testMessageFormatResourceBundle() {
    var locale = Locale.of("id","ID");
    var resourceBundle = ResourceBundle.getBundle("message", locale);

    var pattern = resourceBundle.getString("welcome.message");

    var messageFormat = new MessageFormat(pattern);
    var format = messageFormat.format(new Object[]{
        "Eko", "Programmer Zaman Now"
    });

    System.out.println(format);
  }
}
