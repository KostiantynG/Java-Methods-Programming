package by.bsu.fund.entity;

/**
 * # 3 # вызов нестатического final-метода из конструктора # Coin.java
 */
public class Coin {
    private double diameter;

    // поля
    public Coin(double diameter) {
        initDiameter(diameter); // обращение к final-методу
    }

    public final void initDiameter(double value) { // можно public final заменить на private
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Oтрицательный диаметр!");
        }
    }
// методы
}