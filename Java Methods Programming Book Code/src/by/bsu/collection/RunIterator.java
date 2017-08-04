package by.bsu.collection;

import java.util.List;
import java.util.ArrayList;

/**
 * # 5 # методы класса ArrayList и интерфейса Iterator # RunIterator.java # FindOrder.java
 */
public class RunIterator {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<Order>() {
            {
                add(new Order(231, 12.f));
                add(new Order(389, 2.9f));
                add(new Order(217, 1.7f));
            }
        };
        FindOrder findOrder = new FindOrder();
        List<Order> res = findOrder.findBiggerAmountOrder(10f, orders);
        System.out.println(res);
    }
}