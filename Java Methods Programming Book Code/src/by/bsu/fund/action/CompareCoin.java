package by.bsu.fund.action;


import by.bsu.fund.bean.Coin;

/**
 * # 10 # создание объекта, доступ к полям и методам объекта # CompareCoin.java
 * # Runner.java
 */
public class CompareCoin {
    public void compareDiameter(Coin first, Coin second) {
        double delta = first.getDiameter() - second.getDiameter();
        if (delta == 0) {
            System.out.println("Монеты имеют одинаковый диаметр");
        } else if (delta > 0) {
            System.out.println("Первая монета больше второй на " + delta);
        } else {
            System.out.println("Вторая монета больше первой на " + -delta);
        }
    }
//    //* # 11 # метод сравнения экземпляров по одному полю # */
//    public int compareDiameter(Coin first, Coin second) {
//        int result = 0;
//        double delta = first.getDiameter() - second.getDiameter();
//        if (delta > 0) {
//            result = 1;
//        } else if (delta < 0) {
//            result = -1;
//        }
//        return result;
//    }
//    //Формирование отчета следует поместить в другой метод другого класса.
}