package by.bsu.market;

import java.util.concurrent.atomic.AtomicLong;

/**
 * # 11 # запуск потоков изменения атомарного поля и его отслеживания несколькими потоками # AtomicDemo.java
 */
public class AtomicDemo {
    private static final int NUMBER_BROKERS = 3;

    public static void main(String[] args) {
        Market market = new Market(new AtomicLong(100));
        market.start();
        for (int i = 0; i < NUMBER_BROKERS; i++) {
            new Broker(market).start();
        }
    }
}