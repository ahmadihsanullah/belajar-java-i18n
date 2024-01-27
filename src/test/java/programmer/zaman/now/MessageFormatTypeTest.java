package programmer.zaman.now;

import java.util.Date;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class MessageFormatTypeTest {
      @Test
  void testMessageFormatType() {
    var locale = Locale.of("id","ID");
    var resourceBundle = ResourceBundle.getBundle("message", locale);

    var pattern = resourceBundle.getString("status");

    var messageFormat = new MessageFormat(pattern, locale);
    var format = messageFormat.format(new Object[]{
        "Eko", new Date(), 1000000
    });

    System.out.println(format);
  }

  @Test
  void testMessageFormatUS(){
    var locale = Locale.of("en","US");
    var resourceBundle = ResourceBundle.getBundle("message",locale);

    var pattern = resourceBundle.getString("status");

    var messageFormat = new MessageFormat(pattern);
    var format = messageFormat.format(new Object[]{
        "Ahmad", new Date(), 1000000
    });   

    System.out.println(format);

  }
}
