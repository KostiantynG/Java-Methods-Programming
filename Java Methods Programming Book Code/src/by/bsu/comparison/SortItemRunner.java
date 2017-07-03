package by.bsu.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import by.bsu.collection.Item;

/**
 * # 8 # сортировка списка по полю, определенному в классе comparator-е #SortItemRunner.java
 */

public class SortItemRunner {
    public static void main(String[ ] args) {
        ArrayList<Item> items = new ArrayList<Item>() {
            {
                add(new Item(1, 1.00f, "C"));
                add(new Item(2, 2.00f, "B"));
                add(new Item(3, 3.00f, "A"));
            }
        };
        // создание компаратора
        Comparator<Item> comp = new Comparator<Item>() {
            // сравнение для сортировки по убыванию цены товара
            public int compare(Item one, Item two) {
                return Double.compare(two.getPrice(), one.getPrice());
            }
            // public boolean equals(Object ob) { /* реализация */ }
        };

        //lambda Double sort
        items.sort((o1, o2)->Double.compare(o2.getPrice(),o1.getPrice()));
        System.out.println(items);
        //lambda String sort
        items.sort((o1, o2)->o2.getName().compareTo(o1.getName()));
        System.out.println(items);

        // сортировка списка объектов
        Collections.sort(items, comp);
        System.out.println(items);
    }
}