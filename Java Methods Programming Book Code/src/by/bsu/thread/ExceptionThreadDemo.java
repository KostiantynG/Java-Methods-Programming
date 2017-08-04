package by.bsu.thread;

/**
 * # 7 # генерация исключения в созданном потоке # ExceptThread.java # ExceptionThreadDemo.java
 */
public class ExceptionThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        new ExceptThread().start();
        Thread.sleep(1000);
        System.out.println("end of main");
    }
}