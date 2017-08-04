package by.bsu.market;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * # 9 # класс с атомарным полем # Market.java
 */
public class Market extends Thread {
    private AtomicLong index;

    public Market(AtomicLong index) {
        this.index = index;
    }

    public AtomicLong getIndex() {
        return index;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                index.addAndGet(random.nextInt(10));
                Thread.sleep(random.nextInt(500));
                index.addAndGet(-1 * random.nextInt(10));
                Thread.sleep(random.nextInt(500));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}