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
//import by.bsu.fund.exceptions.CoinLogicException;
//
///**
// * # 5 # метод, вызывающий исключение, созданное программистом # Coin.java
// */
//public class Coin {
//    private double diameter;
//    private double weight;
//
//    public double getDiameter() {
//        return diameter;
//    }
//
//    public void setDiameter(double value) throws CoinLogicException {
//        if (value <= 0) {
//            throw new CoinLogicException("diameter is incorrect");
//        }
//        diameter = value;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double value) {
//        weight = value;
//    }
//}