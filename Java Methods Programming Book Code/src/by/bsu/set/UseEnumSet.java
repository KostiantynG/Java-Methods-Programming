package by.bsu.set;

import java.util.EnumSet;

/**
 * # 16 # иcпользование множества enum-типов # CarManufacturer.java #UseEnumSet.java
 */
public class UseEnumSet {
    public static void main(String[] args) {
        /* мн ожество japanAuto содержит элементы типа
        enum из интервала, определенного двумя элементами */
        EnumSet<CarManufacturer> japanAuto =
                EnumSet.range(CarManufacturer.TOYOTA, CarManufacturer.SUZUKI);
         /* множество other будет содержать все элементы, не содержащиеся в множестве japanAuto */
        EnumSet<CarManufacturer> other = EnumSet.complementOf(japanAuto);
        System.out.println(japanAuto);
        System.out.println(other);
        action("audi", japanAuto);
        action("suzuki", japanAuto);
    }

    public static boolean action(String auto, EnumSet<CarManufacturer> set) {
        CarManufacturer cm = CarManufacturer.valueOf(auto.toUpperCase());
        boolean ok = false;
        if (ok = set.contains(cm)) {
            // обработка
            System.out.println("Обработан: " + cm);
        } else {
            System.out.println("Обработка невозможна: " + cm);
        }
        return ok;
    }
}