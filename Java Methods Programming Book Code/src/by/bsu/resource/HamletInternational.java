package by.bsu.resource;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * # 10 # поддержка различных языков # HamletInternational.java
 */
public class HamletInternational {
    public static void main(String[] args) {
        for (int j = 0; j < 3; j++) {
            System.out.println("1 — английский" + "\n" + "2 — белорусский" + "\n" + "любой — русский ");
            char i = 0;
            try {
                i = (char) System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String country = "";
            String language = "";
            switch (i) {
                case '1':
                    country = "US";
                    language = "EN";
                    break;
                case '2':
                    country = "BY";
                    language = "BE";
                    break;
            }
            Locale current = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("property.text", current);
            String s1 = rb.getString("str1");
            System.out.println(s1);
            String s2 = rb.getString("str2");
            System.out.println(s2);
            i=0;
        }
    }
}