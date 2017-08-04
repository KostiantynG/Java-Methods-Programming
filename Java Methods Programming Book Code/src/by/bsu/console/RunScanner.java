package by.bsu.console;

import java.util.Scanner;

/**
 * # 14 # чтение строки из консоли # RunScanner.java
 */
public class RunScanner {
    public static void main(String[] args) {
        System.out.print("Введите Ваше имя и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name + "!");
        scan.close();
    }
}