package by.bsu.comparison;

/* # 8 # сортировка списка по полю, определенному в классе comparator-е #SortItemRunner.java */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import by.bsu.collection.Item;
public class SortItemRunner {
    public static void main(String[ ] args) {
        ArrayList<Item> p = new ArrayList<Item>() {
            {
                add(new Item(52201, 9.75f, "T-Shirt"));
                add(new Item(52127, 13.99f, "Dress"));
                add(new Item(47063, 45.95f, "Jeans"));
                add(new Item(90428, 60.9f, "Gloves"));
                add(new Item(53295, 31f, "Shirt"));
                add(new Item(63220, 14.9f, "Tie"));
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
// сортировка списка объектов
        Collections.sort(p, comp);
        System.out.println(p);
    }
}