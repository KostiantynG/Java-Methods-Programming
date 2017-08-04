package by.bsu.thread;

/**
 * # 7 # генерация исключения в созданном потоке # ExceptThread.java # ExceptionThreadDemo.java
 */
public class ExceptThread extends Thread {
    public void run() {
        boolean flag = true;

        if (flag) {
            throw new RuntimeException();
        }
        System.out.println("end of ExceptThread");
    }
}