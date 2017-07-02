package by.bsu.entity; // класс доступен из других пакетов

/**
 * # 1 # типы атрибутов и переменных # Order.java
 */

public class Order {
    private int id; // переменная экземпляра класса
    static int bonus; // переменная класса
    public final int MIN_TAX = 8 + (int)(Math.random()*5); // константа экземпляра класса
    public final static int PURCHASE_TAX = 6; // константа класса
    // конструкторы
    // метод
    public double calculatePrice(double price, int counter) { /* параметры метода */
        double amount; // локальная переменная метода не получает значения по умолчанию
        // amount++; // ошибка компиляции, значение не задано
        amount = (price - bonus) * counter; // инициализация локальной переменной
        double tax = amount * PURCHASE_TAX /100;
        return amount + tax; // возвращаемое значение
    }
}