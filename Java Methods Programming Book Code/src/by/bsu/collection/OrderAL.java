package by.bsu.collection;

import java.util.ArrayList;

/**
 * # 7 # класс, наследующий список и приобретающий его свойства # Order.java
 */

public class OrderAL extends ArrayList<Item> {
    private int orderId;

    // private float amount; // по прежнему не нужен, т.к. сумму можно вычислить
    public OrderAL(ArrayList<Item> c) {
        super(c);
    }

    public OrderAL(int orderId, ArrayList<? extends Item> c) {
        super(c);
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}