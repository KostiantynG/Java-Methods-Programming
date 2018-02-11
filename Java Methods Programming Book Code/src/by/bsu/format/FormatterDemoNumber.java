package by.bsu.format;

import java.util.Formatter;

/**
 * # 16 # форматирование чисел с использованием спецификаторов %x, %o, %a, %g
 * #FormatterDemoNumber.java
 */
public class FormatterDemoNumber {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("Hex: %x, Octal: %o", 100, 100);
        System.out.println(f);
        f = new Formatter();
        f.format("%a", 100.001);
        System.out.println(f);
        f = new Formatter();
        for (double i = 1000; i < 1.0e+10; i *= 100) {
            f.format("%g ", i);
            System.out.println(f);
        }
    }
}