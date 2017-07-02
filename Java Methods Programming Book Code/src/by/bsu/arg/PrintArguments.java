package by.bsu.arg;

/**
 * # 6 # вывод аргументов командной строки в консоль # PrintArguments.java
 *
 * Запуск этого приложения осуществляется с помощью следующей командной строки вида:
 * java by.bsu.arg.PrintArguments 2012 Oracle "Java SE 7"
 */

public class PrintArguments {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.printf("Aргумент-> %s%n", str);
        }
//        for (int i = 0; i < args.length; i++) {
//            System.out.println("Aргумент-> " + args[i]);
//        }
    }
}