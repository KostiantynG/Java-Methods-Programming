package by.bsu.semaphore;

import java.util.concurrent.Semaphore;

public class MySemaphore {
    private Semaphore semaphore;

    public MySemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            semaphore.acquire();
            System.out.println("код использования защищаемого ресурса");
            //код использования защищаемого ресурса
        } catch (InterruptedException e) {
        } finally {
            System.out.println("освобождение семафора");
            semaphore.release(); // освобождение семафора
        }
    }

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(10);
        MySemaphore mySemaphore =new MySemaphore(semaphore);
        mySemaphore.run();
    }
}