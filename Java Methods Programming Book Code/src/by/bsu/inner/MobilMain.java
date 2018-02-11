package by.bsu.inner.run;

import by.bsu.inner.Abonent;

/**
 * # 5 # инициализация и использование экземпляра Abonent # MobilMain.java
 */
public class MobilMain {
    public static void main(String[] args) {
        Abonent abonent = new Abonent(819002, "Timofey Balashov");
        abonent.setTariffPlan("free");
        abonent.obtainPhoneNumber(375, 25);
        System.out.println(abonent);
    }
}