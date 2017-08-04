package by.bsu.blocking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * # 16 # демонстрация возможностей блокирующей очереди # RunBlocking.java
 */

public class RunBlocking {
    public static void main(String[] args) {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
        new Thread(() -> {
            for (int i = 1; i < 4; i++) {
                try {
                    queue.put("Java_" + i); // добавление 3-х
                    System.out.println("Element " + i + " added");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            try {
                //Thread.sleep(1_000);
                String take;
                take = queue.take();// Retrieves and removes the head of this queue
                System.out.println("Element " + take + " took");
                take = queue.take();// Retrieves and removes the head of this queue
                System.out.println("Element " + take + " took");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}