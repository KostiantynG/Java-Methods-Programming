package by.bsu.daemons;

/**
 * # 6 # запуск и выполнение потока-демона # SimpleThread.java # DaemonRunner.java
 */
public class SimpleThread extends Thread {
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("старт потока-демона");
                Thread.sleep(1); // заменить параметр на 1
            } else {
                System.out.println("старт обычного потока");
            }
        } catch (InterruptedException e) {
            System.err.print(e);
        } finally {
            if (!isDaemon()) {
                System.out.println("завершение обычного потока");
            } else {
                System.out.println("завершение потока-демона");
            }
        }
    }
}