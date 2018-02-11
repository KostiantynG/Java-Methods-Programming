package by.bsu.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

/**
 * # 14 # региональные представления дат # DemoDateFormat.java
 */
public class DemoDateFormat {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        Date d = null;
        String str = "April 9, 2012";
        try {
            d = df.parse(str);
            System.out.println(d);
        } catch (ParseException e) {
            System.err.print("Error position: " + e.getErrorOffset());
        }
        df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RU"));
        System.out.println(df.format(d));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
        System.out.println(df.format(d));
    }
}