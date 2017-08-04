package by.bsu.check;

import by.bsu.collection.Order;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * # 22 # проверяемая коллекция # SafeSetRun.java
 */
public class SafeSetRun {
    public static void main(String args[]) {
        Set<Order> orders;
        // orders = new HashSet(); // заменяемый код на jdk1.4 и ниже
        orders = Collections.checkedSet(new HashSet<>(), Order.class);

        orders.add(new Order(231, 12.f));
        // some code here
        //orders.add(new Item(23154, 120.f, "Xerox")); // runtime error
        System.out.println(orders);
    }
}


