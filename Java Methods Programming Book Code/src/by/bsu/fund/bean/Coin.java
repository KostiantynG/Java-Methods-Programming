package by.bsu.fund.bean;

/**
 * # 9 # «туго» инкапсулированный класс (Java Bean) # Coin.java
 */
public class Coin {
    private double diameter; // правильная инкапсуляция
    private double weight; // правильная инкапсуляция

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Oтрицательный диаметр!");
        }
    }

    public double getWeight() { // правильное имя метода
        return weight;
    }

    public void setWeight(double value) {
        weight = value;
    }
}

// # 7 # простой пример класса носителя информации # Coin.java
//public class Coin {
//    public double diameter; // нарушение инкапсуляции
//    private double weight; // правильная инкапсуляция
//    public double getDiameter() {
//        return diameter;
//    }
//    public void setDiameter(double value) {
//        if (value > 0) {
//            diameter = value;
//        } else {
//            diameter = 0.01; // значение по умолчанию
//        }
//    }
//    public double takeWeight() { // некорректно: неправильное имя метода
//        return weight;
//    }
//    public void setWeight(double value) {
//        weight = value;
//    }
//}