package by.bsu.format;

import java.util.Formatter;

/**
 * # 15 # форматирование строки при помощи метода format() # SimpleFormatString.java
 */
public class SimpleFormatString {
    public static void main(String[] args) {
        Formatter f = new Formatter(); // объявление объекта
        // форматирование текста по формату %S, %c
        f.format("This %s is about %n%S %c", "book", "java", '8');
        System.out.print(f);
    }
}