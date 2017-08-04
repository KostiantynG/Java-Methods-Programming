package by.bsu.priority;

/**
 * 3 # демонстрация приоритетов # PriorityRunner.java # PriorThread.java
 */
public class PriorityRunner {
    public static void main(String[] args) {

        PriorThread min = new PriorThread("Min");
        PriorThread max = new PriorThread("Max");
        PriorThread norm = new PriorThread("Norm");

        min.setPriority(Thread.MIN_PRIORITY); // 1
        max.setPriority(Thread.MAX_PRIORITY); // 10
        norm.setPriority(Thread.NORM_PRIORITY); // 5

        min.start();
        norm.start();
        max.start();

        ThreadGroup tg = new ThreadGroup("Группа потоков 1");
        Thread t0 = new Thread(tg, "поток 0");
    }
}