package by.bsu.daemons;

/**
 * # 6 # запуск и выполнение потока-демона # SimpleThread.java # DaemonRunner.java
 */
public class DaemonRunner {
    public static void main(String[] args) {
        SimpleThread usual = new SimpleThread();
        SimpleThread daemon = new SimpleThread();
        daemon.setDaemon(true);
        daemon.start();
        usual.start();
        System.out.println("последний оператор main");
    }
}