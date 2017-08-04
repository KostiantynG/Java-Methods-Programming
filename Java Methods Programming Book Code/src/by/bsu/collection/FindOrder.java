package by.bsu.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * # 5 # методы класса ArrayList и интерфейса Iterator # RunIterator.java # FindOrder.java
 */
public class FindOrder {
    public List<Order> findBiggerAmountOrder(float bigAmount, List<Order> orders) {
        ArrayList<Order> bigPrices = new ArrayList<>();
        Iterator<Order> it = orders.iterator();
        while (it.hasNext()) {
            Order current = it.next();
            if (current.getAmount() >= bigAmount) {
                bigPrices.add(current);
            }
        }
        return bigPrices;
    }
}