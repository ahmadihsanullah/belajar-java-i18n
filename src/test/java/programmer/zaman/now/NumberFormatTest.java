package programmer.zaman.now;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class NumberFormatTest {
    @Test
    void testNumberFormat(){
        var numberFormat = NumberFormat.getInstance();
        var format = numberFormat.format(10000000.255);
        System.out.println(format); // format inggris
    }

    @Test
    void testNumberFormatIndonesia(){
        //menambah locale indonesia
        Locale indonesia = Locale.of("id","ID");
        var numberFormat = NumberFormat.getInstance(indonesia);
        var format = numberFormat.format(10000000.255);
        System.out.println(format); // format indonesia
    }

    @Test
    void testNumberFormatParseIndonesia(){
        //menambah locale indonesia
        Locale indonesia = Locale.of("id","ID");
        var numberFormat = NumberFormat.getInstance(indonesia);
       
        try{
            var result = numberFormat.parse("10.000.000,225").doubleValue();
            System.out.println(result);
        }catch(ParseException exception){
            System.out.println("Error parse : " + exception);
        }
    }

}
